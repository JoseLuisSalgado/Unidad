package uhv1.Persistencia;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uhv1.Negocio.Casa;
import uhv1.Negocio.Evento;
import uhv1.Negocio.Responsable;
import uhv1.Persistencia.ManejadorBD;

/*
 * @author Vianey
 */
public class DAOEvento {

    public Evento buscaEvento(String nombre) {
        
        String nomE;
        Date fechaR;
        String descripcion;
        int hab;
        int ca;
        float saldo;
        int id;
        
        try {
            Statement statement = ManejadorBD.dameConnection().createStatement();
            
            ResultSet rs = statement.executeQuery("SELECT * FROM Evento WHERE nombre_evento ='"+nombre+"';");
            /*se pone el apuntador una fila depues para guardar los datos recibidos*/
            rs.next();
            /* Se guardan los datos del evento recibidos en las variables correspondientes*/
            
            id = rs.getInt("idEvento");
            nomE = rs.getString("nombre_evento");
            fechaR = rs.getDate("fecha_Reservacion");
            descripcion = rs.getString("descripcion");
            saldo = rs.getFloat("saldo");
            hab = rs.getInt("Habitantes_idHabitante");
            rs.close();
            
        } catch (SQLException e) {
            System.out.println("Hubo un error 1");
            e.printStackTrace();
            return null;
        }
        try {

            Statement statement = ManejadorBD.dameConnection().createStatement();
            System.out.println("Aki tamo");
            /* Se busca el habitante  del evento solicitado */
            ResultSet rs3 = statement.executeQuery("SELECT * FROM Habitantes WHERE idHabitante = '" + hab + "';");
            rs3.next();
            ca  = rs3.getInt("Casas_idCasa");
            System.out.println("Aki tamo2");
            Casa aux = null; 
            Responsable habitante = new Responsable(rs3.getInt("idHabitante"), rs3.getString("nombre"), rs3.getString("aPat"), rs3.getString("aMat"), rs3.getFloat("telefono"), aux, rs3.getFloat("saldo"));
            /* Se busca la casa del habitante solicitado */
            ResultSet rs2 = statement.executeQuery("SELECT * FROM Casas WHERE idCasa = '" + ca+ "';");
            rs2.next();
            System.out.println("Aki tamo3");
            /* Se crean los objetos casa y responsable con los datos del habitante solicitado y se asignan al evento*/
            Casa casa = new Casa(rs2.getInt("idCasa"), rs2.getString("seccion"), rs2.getInt("numero"));
            System.out.println("Aki tamo4");
            habitante.setCasa(casa);
            
            System.out.println("Aki tamo5");
            Evento evento = new Evento(id, nomE, fechaR, descripcion, saldo, habitante);
            System.out.println("Aki tamo6");
           
            rs3.close();
            rs2.close();

            return evento;
            
        } catch (SQLException e) {
            System.out.println("Hubo un error 2");
            e.printStackTrace();
            return null;
        }

    }
}
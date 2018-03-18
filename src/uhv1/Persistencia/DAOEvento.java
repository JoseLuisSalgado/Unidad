package uhv1.Persistencia;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uhv1.Negocio.Casa;
import uhv1.Negocio.Evento;
import uhv1.Negocio.Responsable;
import uhv1.Persistencia.ManejadorBD;

/**
 *
 * @author Vianey
 */
public class DAOEvento {

    public Evento buscaEvento(String nombreEvento) {

        String nomE;
        Date fechaR;
        String descripcion;
        int hab;
        int ca;
        float saldo;
        int id;

        try {
            Statement statement = ManejadorBD.dameConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Eventos WHERE nombre = '" + nombreEvento + "';");
            /*se pone el apuntador una fila depues para guardar los datos recibidos*/
            rs.next();
            /* Se guardan los datos del evento recibidos en las variables correspondientes*/

            id = rs.getInt("idEvento");
            nomE = rs.getString("nombreEvento");
            fechaR = rs.getDate("fechaReservacion");
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
            
            /* Se busca el habitante  del evento solicitado */
            ResultSet rs3 = statement.executeQuery("SELECT * FROM Habitantes WHERE idHabitante = '" + hab + "';");
            rs3.next();
            ca  = rs3.getInt("Casas_idCasa");
            
            /* Se busca la casa del habitante solicitado */
            ResultSet rs2 = statement.executeQuery("SELECT * FROM Casas WHERE idCasa = '" + ca+ "';");
            rs2.next();
            
            /* Se crean los objetos casa y responsable con los datos del habitante solicitado y se asignan al evento*/
            Casa casa = new Casa(rs2.getInt("idCasa"), rs2.getString("seccion"), rs2.getInt("numero"));
            Responsable habitante = new Responsable(rs3.getInt("idHabitante"), rs3.getString("nombre"), rs3.getString("aPat"), rs3.getString("aMat"), rs3.getFloat("telefono"), casa, rs3.getFloat("saldo"));
            Evento evento = new Evento(id, nomE, fechaR, descripcion, saldo, habitante);
           
            rs2.close();
            rs3.close();

            return evento;
            
        } catch (SQLException e) {
            System.out.println("Hubo un error 2");
            e.printStackTrace();
            return null;
        }

    }
}

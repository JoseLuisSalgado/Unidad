/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uhv1.Negocio.Casa;
import uhv1.Negocio.Responsable;
import uhv1.Negocio.Tarjeton;

/**
 *
 * @author darky
 */
public class DAOTarjeton {

    public void bajaTarjeton(Tarjeton ton, Responsable hab) {

        try {
            Statement statement = ManejadorBD.dameConnection().createStatement();

            statement.execute("UPDATE tarjeton SET estado='" + ton.getEstado()
                    + "'  where num_estacionamiento = '" + ton.getNum_estacionamiento()+ "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Tarjeton buscaTarjeton(int id){
        int num_esta;
        String placas;
        String fecha_impre;
        String fecha_venci;
        String estado;
        //System.out.println("Está en busca Tarjeton ");
        try{
            Statement statement = ManejadorBD.dameConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Tarjeton WHERE Habitantes_idHabitante= '"+id +"';");
            rs.next();
            num_esta=rs.getInt("num_estacionamiento");
            placas=rs.getString("placas");
            fecha_impre=rs.getString("fecha_impresion");
            fecha_venci=rs.getString("fecha_vencimiento");
            estado=rs.getString("estado");
            
            Tarjeton tarje = new Tarjeton(id,num_esta, placas,fecha_impre, fecha_venci,estado);
            
            rs.close();
            return tarje;
        }catch(SQLException e){
            System.out.println("Hubo un error 3");
            e.printStackTrace();
            return null;
        }
    }
    public Responsable buscaHabitante(String nombre, String aPat) {
        String nom;
        String aPata;
        String aMat;
        float tel;
        int ca;
        float saldo;
        int id;
        //System.out.println("Está en busca Habitante ");
        try {
            /*
            String consulta = "SELECT 
            t.id_tarifa_t, r.ciudad_origen,
            r.ciudad_destino, s.descripcion_s , 
            t.hora_salida,
            t.costo_pasaje FROM  tarifa t , ruta10 r,   servicio s WHERE t.id_servicio = s.id_servicio AND t.id_ruta = r.id_ruta";
            */
            
            /*
            
            SELECT res.id
            */
            Statement statement = ManejadorBD.dameConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Habitantes WHERE nombre = '" + nombre + "' AND aPat= '" + aPat + "';");
            /*se pone el apuntador una fila depues para guardar los datos recibidos*/
            rs.next();
            /* Se guardan los datos recibidos en las variables correspondientes*/
            id = rs.getInt("idHabitante");
            nom = rs.getString("nombre");
            aPata = rs.getString("aPat");
            aMat = rs.getString("aMat");
            tel = rs.getFloat("telefono");
            ca = rs.getInt("Casas_idCasa");
            saldo = rs.getFloat("saldo");
            rs.close();
        } catch (SQLException e) {
            System.out.println("Hubo un error 1");
            e.printStackTrace();
            return null;
        }
        try {
            Statement statement = ManejadorBD.dameConnection().createStatement();
            /* Se busca la casa del habitante solicitado */
            ResultSet rs2 = statement.executeQuery("SELECT * FROM Casas WHERE idCasa = '" + ca + "';");
            rs2.next();
            /* Se crean los objetos casa y responsable con los datos del habitante solicitado*/
            Casa casa = new Casa(rs2.getInt("idCasa"), rs2.getString("seccion"), rs2.getInt("numero"));
            Responsable res = new Responsable(id, nom, aPata, aMat, tel, casa, saldo);
            rs2.close();
            return res;
        } catch (SQLException e) {
            System.out.println("Hubo un error 2");
            e.printStackTrace();
            return null;
        }
    }
}

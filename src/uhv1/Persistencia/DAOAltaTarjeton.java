
package uhv1.Persistencia;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import uhv1.Negocio.Casa;
import uhv1.Negocio.ControlAltaTarjeton;
import uhv1.Negocio.Responsable;

public class DAOAltaTarjeton {
    
    public void insertaTarjeton(Responsable hab, String plac) throws SQLException{
        java.sql.Date fechaActual; //calcula la fecha actual
        fechaActual = java.sql.Date.valueOf(LocalDate.now());
        Calendar cal = Calendar.getInstance();//intsancia para sumar un mes a la fecha actual
        cal.add(Calendar.MONTH, 1);//suma un mes
        java.sql.Date fechaVencimiento = new java.sql.Date(cal.getTimeInMillis());//cast para Date de sql
        //System.out.println(fechaActual);
        //System.out.println(fechaVencimiento);
        ControlAltaTarjeton cat = new ControlAltaTarjeton();//Instancia para regresar avisos 
        try {
            String insertaSQL = "Insert INTO tarjeton(Habitantes_idHabitante, placas, fecha_impresion, fecha_vencimiento, estado) VALUES ("+hab.getId()+", '"+ plac +"', '" +fechaActual+"', '" +fechaVencimiento+"', 'Activo')";
            Statement statement = ManejadorBD.dameConnection().createStatement();
            statement.execute(insertaSQL);
            System.out.println("Se ha agregado Tarjetón correctamente");
            cat.recibeExitoDAO(true);
        
        } catch (SQLException e) {
           cat.recibeExitoDAO(false);
           e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {
        Casa cas = new Casa(1, "D", 105);
        String placas = "123ACDC";
        Responsable hab = new Responsable(1, "Eleazar", "Morales", "Garduño", 12312412, cas, 20);
        DAOAltaTarjeton dao = new DAOAltaTarjeton();
        dao.insertaTarjeton(hab, placas);
    }
}

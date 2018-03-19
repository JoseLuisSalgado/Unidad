
package uhv1.Negocio;

import java.sql.SQLException;
import uhv1.Persistencia.DAOAltaTarjeton;

public class ControlAltaTarjeton {
    
    public ControlAltaTarjeton(){//constuctor default
    }
    
    public void inicia(Responsable hab){
        ControlVentanaAltaTarjeton cvat = new ControlVentanaAltaTarjeton();
        cvat.creaVentanaAltaTarjeton(hab);
    }
    
    public void enviaDAOAltaTajeton(Responsable hab, String plac) throws SQLException{
        DAOAltaTarjeton daot = new DAOAltaTarjeton();
        daot.insertaTarjeton(hab, plac);
    }
    
    public void recibeExitoDAO(boolean result){
            ControlVentanaAltaTarjeton cvat = new ControlVentanaAltaTarjeton();
            cvat.ventanaExito(result);
    }
    
    public static void main(String[] args) {
        Casa cas = new Casa(1, "D", 105);
        Responsable res = new Responsable(1, "Eleazar", "Morales", "Gadrduño", 1225623, cas, 50);
        ControlAltaTarjeton cat = new ControlAltaTarjeton();
        cat.inicia(res);
    }
}

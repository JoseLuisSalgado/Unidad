
package uhv1.Negocio;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uhv1.Vistas.VentanaAltaTarjeton;


public class ControlVentanaAltaTarjeton {

    public ControlVentanaAltaTarjeton(Responsable hab){
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VentanaAltaTarjeton(hab).setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(ControlVentanaAltaTarjeton.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}

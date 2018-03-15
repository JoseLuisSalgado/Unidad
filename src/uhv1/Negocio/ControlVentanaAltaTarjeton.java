
package uhv1.Negocio;

import uhv1.Vistas.VentanaAltaTarjeton;


public class ControlVentanaAltaTarjeton {

    public ControlVentanaAltaTarjeton(Responsable hab){
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaAltaTarjeton(hab).setVisible(true);
        });
    }
}

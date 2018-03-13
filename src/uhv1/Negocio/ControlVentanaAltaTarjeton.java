
package uhv1.Negocio;

import uhv1.Vistas.VentanaAltaTarjeton;


public class ControlVentanaAltaTarjeton {

    public ControlVentanaAltaTarjeton(){
        java.awt.EventQueue.invokeLater(() -> {
                new VentanaAltaTarjeton().setVisible(true);
            
        });
    }
    
    public static void main(String[] args) {
        ControlVentanaAltaTarjeton cvat = new ControlVentanaAltaTarjeton();

    }
}

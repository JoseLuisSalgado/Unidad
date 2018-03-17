
package uhv1.Negocio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uhv1.ControlPrincipal;
import uhv1.Vistas.VentanaAltaTarjeton;


public class ControlVentanaAltaTarjeton {

    public ControlVentanaAltaTarjeton() {
    }
    

    public ControlVentanaAltaTarjeton(Responsable hab){
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VentanaAltaTarjeton(hab).setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(ControlVentanaAltaTarjeton.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    public void recibeDatosFormulario(Responsable hab, String plac) throws SQLException{
        ControlAltaTarjeton cat = new ControlAltaTarjeton();
            cat.enviaDAOAltaTajeton(hab, plac);
    }
    
    public void ventanaExito(boolean result){
        if(result==true){
            JOptionPane.showMessageDialog(null, "Aviso: Se realizó el registro correcto del Alta del Tarjetón al habitante", "Aviso:",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Aviso: No se realizó el registro del Tarjetón.", "Aviso:",JOptionPane.INFORMATION_MESSAGE);   
        }
        ControlPrincipal cp = new ControlPrincipal();
        cp.inicia();
        
    } 
}

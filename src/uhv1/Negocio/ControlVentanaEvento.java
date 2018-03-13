package uhv1.Negocio;

import uhv1.Vistas.VentanaEventos;

/**
 *
 * @author darky
 */
public class ControlVentanaEvento {
    public void inicia(){
        ControlBuscaEvento busca_evento = new ControlBuscaEvento();
        VentanaEvento VE = new VentanaEvento(busca_evento);
        
        VE.setVisible(true);
    }
    
}

package uhv1.Negocio;

import uhv1.Persistencia.DAOEvento;
import uhv1.Persistencia.DAOHabitantes;
import uhv1.Vistas.VentanaEventos;

/**
 *
 * @author darky
 */
public class ControlVentanaEvento {
    
     DAOEvento daoeventos;
    DAOHabitantes daohabitante;

    public ControlVentanaEvento() {
        this.daoeventos = new DAOEvento();
        this.daohabitante = new DAOHabitantes();
    }
    public void inicia(){
       
        VentanaEventos VE = new VentanaEventos(this);
        VE.setVisible(true);
    }
    
    public void controlBusca(){
        ControlBuscaEvento busca_evento = new ControlBuscaEvento(daoeventos);
        busca_evento.inicia();
    }
    
}

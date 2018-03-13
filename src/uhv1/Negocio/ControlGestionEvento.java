
import uhv1.Negocio.Evento;
import uhv1.Persistencia.DAOEvento;


public class ControlGestionEvento {
    
    Evento even;
    DAOEvento dahoeven;

    public ControlGestionEvento(Evento even, DAOEvento dahoeven) {
        this.even = even;
        this.dahoeven = dahoeven;
    }
    
     public void inicia(){
        System.out.println("DESDE Inicia: " + even.getNombre());
        VentanaGestionEvento ventGes = new VentanaGestionEvento(this, even);
        ventGes.setVisible(true);
    }
    
}

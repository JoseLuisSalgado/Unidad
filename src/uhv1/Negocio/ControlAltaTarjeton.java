
package uhv1.Negocio;

public class ControlAltaTarjeton {
    
    public ControlAltaTarjeton(){//constuctor default
    }
    
    public ControlAltaTarjeton(Responsable hab){
        ControlVentanaAltaTarjeton cvat = new ControlVentanaAltaTarjeton(hab);
    }
    
    public static void main(String[] args) {
        Casa cas = new Casa(1, "D", 100);
        Responsable res = new Responsable(1, "Eleazar", "Morales", "Gadrduño", 1225623, cas, 20);
        ControlAltaTarjeton cat = new ControlAltaTarjeton(res);
    }
}

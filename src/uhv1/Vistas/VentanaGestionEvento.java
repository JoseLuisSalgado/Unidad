package uhv1.Vistas;
import uhv1.Negocio.Evento;
import uhv1.Negocio.ControlGestionEvento;


/**
 *
 * @author Vianey
 */
public class VentanaGestionEvento extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGestionEvento
     */
    
    ControlGestionEvento control;
    Evento even;
    
    public VentanaGestionEvento(ControlGestionEvento control,Evento even) {
        this.control = control;
        this.even = even;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

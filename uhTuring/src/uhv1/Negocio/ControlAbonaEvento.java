/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;


import uhv1.Vistas.VentanaAbonaEvento;

/**
 *
 * @author adrianags
 */
public class ControlAbonaEvento {
    
    
    
    
    public void inicia(){
        VentanaAbonaEvento ventaAbona = new VentanaAbonaEvento(this);
        ventaAbona.setVisible(true);
    }
    
    public void aceptaAbonar(){
        ControlImprimeAbonoE CIA = new ControlImprimeAbonoE();
        
        CIA.imprimeAbono();
    }
}

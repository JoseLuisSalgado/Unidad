/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Vistas.VentanaEventos;

/**
 *
 * @author darky
 */
public class ControlVentanaEventos {
    public void inicia(){
        ControlBuscaEvento busca_evento = new ControlBuscaEvento();
        VentanaEventos VE = new VentanaEventos(busca_evento);
        
        VE.setVisible(true);
    }
    
}

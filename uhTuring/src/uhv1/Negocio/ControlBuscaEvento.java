/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Vistas.VentanaBuscaEvento;

/**
 *
 * @author Jose Luis
 */
public class ControlBuscaEvento {
    
    public ControlBuscaEvento(){
    }
       
    public void inicia(){
        VentanaBuscaEvento busca_evento = new VentanaBuscaEvento(this);
        busca_evento.setVisible(true);
    }
}

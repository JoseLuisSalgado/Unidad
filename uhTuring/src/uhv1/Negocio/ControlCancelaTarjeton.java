/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Persistencia.DAOTarjeton;
import uhv1.Vistas.VentanaCancelaTarjeton;

/**
 *
 * @author adrianags
 */
public class ControlCancelaTarjeton {
    
    DAOTarjeton daotar;
    Tarjeton tarje [];
    
    public ControlCancelaTarjeton(DAOTarjeton daotar, Tarjeton tarje[]){
        this.daotar=daotar;
        this.tarje=tarje;
    }
    
    public void inicia(){
        VentanaCancelaTarjeton ventCT = new VentanaCancelaTarjeton();
        ventCT.setVisible(true);
    }
}

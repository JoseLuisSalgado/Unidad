/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Persistencia.DAOTarjeton;
import uhv1.Vistas.VentanaTarjeton;

/**
 *
 * @author adrianags
 */
public class ControlGestionTarjeton {
    
    
    Responsable res;
    DAOTarjeton daotar;
    Tarjeton ton;
    public ControlGestionTarjeton(Responsable res, DAOTarjeton daotar, Tarjeton tar){
        this.res = res;
        this.daotar = daotar;
        this.ton=tar;
        
    }
    
    public void incicia(){
        
        VentanaTarjeton ventHab= new VentanaTarjeton(this,res,ton);
        ventHab.setVisible(true);
    }
    
    public void bajaPulsado(){
       
        ControlBajaTarjeton controlbaja = new ControlBajaTarjeton(daotar,res,ton);
        controlbaja.inicia();
    }
   
}

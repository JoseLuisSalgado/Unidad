/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.ControlPrincipal;
import uhv1.Persistencia.DAOTarjeton;
import uhv1.Vistas.VentanaBajaTarjeton;
import uhv1.Vistas.VentanaConfirmacion;

/**
 *
 * @author adrianags
 */
public class ControlBajaTarjeton {
    DAOTarjeton daotar;
    Tarjeton tar;
    Responsable res;
    
    public ControlBajaTarjeton(DAOTarjeton dao, Responsable res, Tarjeton tarje){
        this.daotar=dao;
        this.res=res;
        this.tar=tarje;
    }

    
     public void inicia(){
        VentanaBajaTarjeton venbajatar = new VentanaBajaTarjeton(this);
        venbajatar.setVisible(true);
    }
     
    public void botonCancela(){
        ControlPrincipal bt = new ControlPrincipal();
        bt.inicia();
    }
    
    public void botonAcepta() {
        
        String estado;
        estado= "Cancelado";
        
        Tarjeton tar2 = new Tarjeton(tar.getId(),tar.getNum_estacionamiento(), tar.getPlacas(), tar.getFecha_impresion(), tar.getFecha_vencimiento(), estado);
        if(tar2!=null){
            daotar.bajaTarjeton(tar2, res);
            VentanaConfirmacion venbt = new VentanaConfirmacion (this);
            venbt.setVisible(true);
        }else{
            System.out.println("No se pudo dar de baja el Tarjeton");
        }
    }
    
     public void controlPrincipal(){
        
        ControlPrincipal control = new ControlPrincipal();
        control.inicia();
    }
}


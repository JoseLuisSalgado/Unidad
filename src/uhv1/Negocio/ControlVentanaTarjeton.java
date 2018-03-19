/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;


import uhv1.ControlPrincipal;
import uhv1.Persistencia.DAOTarjeton;
import uhv1.Vistas.VentanaBuscaHabitanteTarjeton;

/**
 *
 * @author darky
 */
public class ControlVentanaTarjeton {
    
    
    Responsable res;
    DAOTarjeton daotar;
    Tarjeton tarje; 
    public ControlVentanaTarjeton(DAOTarjeton daotar){
        this.daotar = daotar;
    }
    public void inicia(){
       VentanaBuscaHabitanteTarjeton VT = new VentanaBuscaHabitanteTarjeton(this);
        VT.setVisible(true);
    }
    
    public void buscaH(String nombre, String aPat){
        Responsable res;
        /* Se envia mensaje al dao habitante con los datos del habitante a buscar */
        res = daotar.buscaHabitante(nombre, aPat);
        int id=res.getId();
       
        Tarjeton tar;
        /*Se envia mensaje al dao tarjeton con el id del tarjeton a buscar */  
        tar= daotar.buscaTarjeton(id);
        
        if(res == null || tar==null){
            /*Si no se encontro el habitante buscado, se envia mensaje a la ventana no encontrado, para
            desplegar una alerta */
            //VentanaNoEncontrado vent = new VentanaNoEncontrado(this);
            //vent.setVisible(true);
            System.out.println("NO SE ENCONTRO ");
        }else{
            if(res.getId()== tar.getId()){
            
            /* Se encontro el habitante, y se crea una instancia de control gestion
            tarjeton con el habitante encontrado y el dao responsable, y lo inicia*/
            ControlGestionTarjeton controlges = new ControlGestionTarjeton(res,daotar,tar);
            controlges.incicia();
           
            }
        }
    }
    public void bajaTarjeton(){
        ControlBajaTarjeton control1 = new ControlBajaTarjeton(daotar, res, tarje);
        control1.inicia();
    }
    
    public void botonCancela(){
        ControlPrincipal bt = new ControlPrincipal();
        bt.inicia();
    }
}

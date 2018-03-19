/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Persistencia.DAOTarjeton;

/**
 *
 * @author adrianags 
 */
public class ControlBuscaHabitanteTarjeton {
     DAOTarjeton daores;
    
    /* Este es el constructor que recibe el dao habitantes */
    public ControlBuscaHabitanteTarjeton(DAOTarjeton daores){
         this.daores = daores;
    }
    
    /* Este metodo recibe mensaje de control ventana habitante y despliega la ventana busca habitante*/
   
    
    
    public void buscaH(String nombre, String aPat){
        Responsable res;
        /* Se envia mensaje al dao habitante con los datos del habitante a buscar */
        res = daores.buscaHabitante(nombre, aPat);
        int id=res.getId();
        System.out.println("res id: "+ id);
        Tarjeton tar;
        tar= daores.buscaTarjeton(id);
        if(res == null || tar==null){
            /*Si no se encontro el habitante buscado, se envia mensaje a la ventana no encontrado, para
            desplegar una alerta */
            //VentanaNoEncontrado vent = new VentanaNoEncontrado(this);
            //vent.setVisible(true);
            System.out.println("NO SE ENCONTRO ");
        }else{
            if(res.getId()== tar.getId()){
            System.out.println("holi "+res.getNombre() + res.getaPat() + res.getaMat()+ tar.getNum_estacionamiento() );
                System.out.println("Tarjeton "+tar.toString());
            /* Se encontro el habitante, y se crea una instancia de control gestion
            habitante con el habitante encontrado y el dao responsable, y lo inicia*/
            ControlGestionTarjeton controlges = new ControlGestionTarjeton(res,daores,tar);
            controlges.incicia();
           // ControlGestionHabitante controlgestiona = new ControlGestionHabitante(res, daores);
           // controlgestiona.inicia();
            }
        }
        
    }
}

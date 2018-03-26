/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Vistas.VentanaImprimirComprobante;

/**
 *
 * @author adrianags
 */
public class ControlImprimeAbonoE {
    
  
    VentanaImprimirComprobante ventIPE;
   
   
    
    public void imprimeAbono(){
         pagos pagosArreglo[] = null ;
        ventIPE = new VentanaImprimirComprobante(this,pagosArreglo);
        ventIPE.setVisible(true);
    }
    
    
    
    
    public void imprimeAcepta(pagos pagos[], Responsable res){
       ControlImprimir ci = new ControlImprimir(pagos,res);
       ci.imprimirHistorial();
   }
    
}

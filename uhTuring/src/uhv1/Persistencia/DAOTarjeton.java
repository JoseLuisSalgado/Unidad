/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import uhv1.Negocio.Tarjeton;

/**
 *
 * @author adriana gs
 */
public class DAOTarjeton {
    
    
    /*
    
    public pagos[] Recupera(Responsable hab){        
        Statement statement;
        ArrayList<pagos> pagosTemp = new ArrayList<pagos>();
        try {
            statement = ManejadorBD.dameConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM pagos where Habitantes_idHabitante =" + hab.getId() + ";");
            while(rs.next()){ // mientras tenga datos que imprimir
                pagos pago = new pagos(rs.getInt("idPago"), rs.getString("fecha"), rs.getFloat("monto"),rs.getInt("Habitantes_idhabitante"),rs.getInt("concepto"));
                System.out.println(pago.getFecha());
                pagosTemp.add(pago);
            }
            pagos pagosTempArreglo[] = new pagos[pagosTemp.size()];
            pagosTemp.toArray(pagosTempArreglo);
            return pagosTempArreglo;
        }catch (SQLException e) {
             e.printStackTrace();
             return null;
        }        
    }
    */
    public Tarjeton[] buscaTarjeton(int id){
       
        System.out.println("Esta en busca DAOTarjeton ");
        
        Statement statement;
        ArrayList<Tarjeton> tarjeton = new ArrayList<Tarjeton>();
        
        try{
            statement = ManejadorBD.dameConnection().createStatement();
            /*
            nombre='" + res.getNombre() + "'AND aPat='" + res.getaPat() + "';"
            */
            ResultSet rs = statement.executeQuery("SELECT * FROM Tarjeton WHERE Habitantes_idHabitante= '"+id +"'AND estado='"+"Activo"+"';");
            while(rs.next()){
                Tarjeton tarje = new Tarjeton(rs.getInt("Habitantes_idHabitante"),rs.getInt("num_estacionamiento"),rs.getString("placas"),rs.getString("fecha_impresion"),rs.getString("fecha_vencimiento"),rs.getString("estado"));
                tarjeton.add(tarje);
            }
 
            Tarjeton tarjetones []= new Tarjeton[tarjeton.size()];
            tarjeton.toArray(tarjetones);
            
            return tarjetones;
        }catch(SQLException e){
            System.out.println("Hubo un error al buscar tarjetones");
            e.printStackTrace();
            return null;
        }
    }
}

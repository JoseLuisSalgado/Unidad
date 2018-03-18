/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

/**
 *
 * @author Jose Luis
 */
public class Evento {
    private int id;
    private Responsable habitante;
    private String nombre_evento;
    private String descripcion;
    private String fecha_reservacion;
    private double saldo; 
           
    public Evento(){
    
    }
    
    public Evento(int id, Responsable habitante, String nomb_event, String descrip, String fecha_reserv, double saldo){
        this.id = id;
        this.habitante = habitante;
        this.nombre_evento = nomb_event;
        this.descripcion = descrip;
        this.fecha_reservacion = fecha_reserv;
        this.saldo = saldo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id_habitante
     */
    public Responsable getId_habitante() {
        return habitante;
    }

    /**
     * @param id_habitante the id_habitante to set
     */
    public void setId_habitante(int id_habitante) {
        this.habitante = habitante;
    }

    /**
     * @return the nombre_evento
     */
    public String getNombre_evento() {
        return nombre_evento;
    }

    /**
     * @param nombre_evento the nombre_evento to set
     */
    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha_reservacion
     */
    public String getFecha_reservacion() {
        return fecha_reservacion;
    }

    /**
     * @param fecha_reservacion the fecha_reservacion to set
     */
    public void setFecha_reservacion(String fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

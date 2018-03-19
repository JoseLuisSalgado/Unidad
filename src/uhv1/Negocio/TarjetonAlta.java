package uhv1.Negocio;

import java.sql.Date;

public class TarjetonAlta {
    private Responsable hab;
    private int num_estacionamiento;
    private String placas;
    private java.sql.Date fecha_impresion;
    private java.sql.Date fecha_vencimiento;
    private String estado;

    public TarjetonAlta() {//Constructor vacio 
    }

    public TarjetonAlta(Responsable hab, int num_estacionamiento, String placas, Date fecha_impresion, Date fecha_vencimiento, String estado) {
        this.hab = hab;
        this.num_estacionamiento = num_estacionamiento;
        this.placas = placas;
        this.fecha_impresion = fecha_impresion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }

    public Responsable getHab() {
        return hab;
    }

    public int getNum_estacionamiento() {
        return num_estacionamiento;
    }

    public String getPlacas() {
        return placas;
    }

    public Date getFecha_impresion() {
        return fecha_impresion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setHab(Responsable hab) {
        this.hab = hab;
    }

    public void setNum_estacionamiento(int num_estacionamiento) {
        this.num_estacionamiento = num_estacionamiento;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setFecha_impresion(Date fecha_impresion) {
        this.fecha_impresion = fecha_impresion;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
    
}

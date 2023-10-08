package Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private Date fecha;
    private String descripcion;
    private Float montoTotal;


     @OneToOne
    public Comprador c;
    @OneToOne
    public Oferta o;

    public Venta(int id, Date fecha, String descripcion, Float montoTotal, Comprador c) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.montoTotal = montoTotal;
        this.c = c;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

   

}

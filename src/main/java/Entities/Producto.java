package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    
    private String nombre;
    private String especificacionesTecnicas;
    private int codigoProducto;

     @OneToOne
    public Oferta o;

    public Producto(int id, String nombre, String especificacionesTecnicas, int codigoProducto) {
        this.id = id;
        this.nombre = nombre;
        this.especificacionesTecnicas = especificacionesTecnicas;
        this.codigoProducto = codigoProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecificacionesTecnicas() {
        return especificacionesTecnicas;
    }

    public void setEspecificacionesTecnicas(String especificacionesTecnicas) {
        this.especificacionesTecnicas = especificacionesTecnicas;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

   

}

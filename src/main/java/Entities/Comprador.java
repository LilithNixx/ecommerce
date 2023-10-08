package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;


@Entity
public class Comprador {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    private String nombre;
    private String apellido;
    private String direccionEntrega;

    //asociacion 1 a 1:
    @OneToOne
    public Venta v;

    public Comprador(int id, String nombre, String apellido, String direccionEntrega, Venta v) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionEntrega = direccionEntrega;
        this.v = v;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    
  
}

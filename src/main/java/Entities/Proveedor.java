package Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;

@Entity
public class Proveedor {
    
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String nombre;
    private String apellido;
    private String direccionEntrega;


    //relacion 0..* 
    public List<Oferta> ofertas;

    public Proveedor() {
        ofertas = new ArrayList<Oferta>();
    }

    //Para mapear una relaión de 1..*
    @OneToMany(mappedBy = "ofertas")
    public CuentaBancaria cb;

    
    public Proveedor(int id, String nombre, String apellido, String direccionEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionEntrega = direccionEntrega;
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

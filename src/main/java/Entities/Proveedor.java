package Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class Proveedor {
    
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String nombre;
    public String apellido;
    public String direccionEntrega;

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

}

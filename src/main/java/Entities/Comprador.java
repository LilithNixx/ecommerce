package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;


@Entity
@Getter @Setter
public class Comprador {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int id;

    public String nombre;
    public String apellido;
    public String direccionEntrega;

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
  
}

package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

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

}

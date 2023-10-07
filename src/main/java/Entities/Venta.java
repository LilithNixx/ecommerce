package Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class Venta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

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

}

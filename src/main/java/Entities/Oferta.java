package Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class Oferta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public String descripcion;
    public int stock;
    public int codigoOferta;
    public Float precio;
    public Date vigencia;

    @OneToOne
    public Venta v;

    @OneToOne
    public Producto p;

    @OneToOne
    public Proveedor prov;

    protected Oferta() {}

    public Oferta(String descripcion, int stock, int codigoOferta, Float precio, Date vigencia) {
    
        this.descripcion = descripcion;
        this.stock = stock;
        this.codigoOferta = codigoOferta;
        this.precio = precio;
        this.vigencia = vigencia;
    }

}

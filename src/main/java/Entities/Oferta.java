package Entities;

//import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
public class Oferta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String descripcion;
    private int stock;
    private int codigoOferta;
    private Float precio;
    //private Date vigencia;

     @OneToOne
    public Venta v;

    @OneToOne
    public Producto p;

    @OneToOne
    public Proveedor prov;

    protected Oferta() {}

    public Oferta(Long id, String descripcion, int stock, int codigoOferta, Float precio /*Date vigencia*/) {
        
        this.id = id;
        this.descripcion = descripcion;
        this.stock = stock;
        this.codigoOferta = codigoOferta;
        this.precio = precio;
       //this.vigencia = vigencia;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(int codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

   /*  public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }*/

}

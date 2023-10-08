package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
public class EntidadBancaria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String razonSocial;
    private String direccion;
    private int nroSucursal;

     @OneToOne
    public CuentaBancaria cb;

    public EntidadBancaria(int id, String razonSocial, String direccion, int nroSucursal) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.nroSucursal = nroSucursal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(int nroSucursal) {
        this.nroSucursal = nroSucursal;
    }

   

}

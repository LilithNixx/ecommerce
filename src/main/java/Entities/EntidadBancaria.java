package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class EntidadBancaria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    
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

}

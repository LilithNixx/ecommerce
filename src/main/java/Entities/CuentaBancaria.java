package Entities;

import jakarta.persistence.OneToOne;

public abstract class CuentaBancaria {

    @OneToOne
    public Proveedor proveedor1;
    @OneToOne
    public EntidadBancaria entBancA;

    public String verificarSaldo (Float otroSaldo){
        return null;
        
    }
}

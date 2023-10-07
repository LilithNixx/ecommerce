package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class CuentaCorriente extends CuentaBancaria {
   
    private static final String String = null;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int Id;
    
    public Float saldo;
    public String cuu;
    public String estado;

    public CuentaCorriente(Float saldo, String cuu, String estado) {
        this.saldo = saldo;
        this.cuu = cuu;
        this.estado = estado;
    }
        
    @Override
    public String verificarSaldo (Float otroSaldo){
        return String;
    }
}
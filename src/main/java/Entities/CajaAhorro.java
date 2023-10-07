package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Getter @Setter
public class CajaAhorro extends CuentaBancaria {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int id;

    private Float saldo;
    private String cuu;
    private String estado;

    public CajaAhorro(int id, Float saldo, String cuu, String estado) {
        this.id = id;
        this.saldo = saldo;
        this.cuu = cuu;
        this.estado = estado;
    }


    @Override
    public String verificarSaldo (Float otroSaldo){
        return null;
    }
}

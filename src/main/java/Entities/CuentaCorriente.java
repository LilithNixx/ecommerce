package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class CuentaCorriente extends CuentaBancaria {
   
    private static final String String = null;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    
    private Float saldo;
    private String cuu;
    private String estado;

    public CuentaCorriente(Float saldo, String cuu, String estado) {
        this.saldo = saldo;
        this.cuu = cuu;
        this.estado = estado;
    }
        
    @Override
    public String verificarSaldo (Float otroSaldo){
        return String;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getCuu() {
        return cuu;
    }

    public void setCuu(String cuu) {
        this.cuu = cuu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
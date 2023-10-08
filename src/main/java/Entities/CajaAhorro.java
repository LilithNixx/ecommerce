package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class CajaAhorro extends CuentaBancaria {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

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



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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

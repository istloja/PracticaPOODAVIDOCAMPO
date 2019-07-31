/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio1;

/**
 *
 * @author ITS LOJA
 */
public class Cuenta {
    private String nombre_cliente;
    private String Num_cuenta;
    private double tipo_interes;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre_cliente, String Num_cuenta, double tipo_interes, double saldo) {
        this.nombre_cliente = nombre_cliente;
        this.Num_cuenta = Num_cuenta;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo;
    }
     public Cuenta(final Cuenta c) {
        nombre_cliente = c.nombre_cliente;
        Num_cuenta = c.Num_cuenta;
        tipo_interes = c.tipo_interes;
        saldo = c.saldo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNum_cuenta() {
        return Num_cuenta;
    }

    public void setNum_cuenta(String Num_cuenta) {
        this.Num_cuenta = Num_cuenta;
    }

    public double getTipo_interes() {
        return tipo_interes;
    }

    public void setTipo_interes(double tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean Ingreso(double n){
        boolean ingresoCorrecto=true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }
    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
    public boolean transferencia(Cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.Ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}

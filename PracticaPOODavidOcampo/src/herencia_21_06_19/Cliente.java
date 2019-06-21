/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_21_06_19;

/**
 *
 * @author ITS LOJA
 */
public class Cliente extends Persona {
    private int numerodecompras;
    private String tipodepago;

    public int getNumerodecompras() {
        return numerodecompras;
    }

    public void setNumerodecompras(int numerodecompras) {
        this.numerodecompras = numerodecompras;
    }

    public String getTipodepago() {
        return tipodepago;
    }

    public void setTipodepago(String tipodepago) {
        this.tipodepago = tipodepago;
    }
    
    public void comprar() {
        System.out.println("La compra se realizo con exito");
    }
    @Override// significa que estoy sobreescribiendo
    public void saludar(){
        System.out.println("hola soy un cliente");
    }
    public void test(){
        saludar();
        super.saludar();//llama al metodo de la clase padre
    }
    public static void main(String[] args) {
        Cliente primerobjeto= new Cliente();
        primerobjeto.saludar();
//        primerobjeto.comprar();
        primerobjeto.test();
    }
}
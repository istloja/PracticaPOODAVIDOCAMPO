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
public class Proveedor extends Persona {
    private String tipodeproductos;
    private int cobrar;
    private int cantidaddeproductos;

    public String getTipodeproductos() {
        return tipodeproductos;
    }

    public void setTipodeproductos(String tipodeproductos) {
        this.tipodeproductos = tipodeproductos;
    }

    public int getCobrar() {
        return cobrar;
    }

    public void setCobrar(int cobrar) {
        this.cobrar = cobrar;
    }

    public int getCantidaddeproductos() {
        return cantidaddeproductos;
    }

    public void setCantidaddeproductos(int cantidaddeproductos) {
        this.cantidaddeproductos = cantidaddeproductos;
    }
    public void entregar() {
        System.out.println("La entrega se realizo con exito");
    }
    @Override// significa que estoy sobreescribiendo
    public void saludar(){
        System.out.println("hola soy un proveedor");
    }
    public void test(){
        saludar();
        super.saludar();//llama al metodo de la clase padre
    }
    public static void main(String[] args) {
        Proveedor objeto= new Proveedor();
        objeto.saludar();
//        primerobjeto.saludar();
        objeto.test();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio6;

/**
 *
 * @author ITS LOJA
 */
public class Tecnico extends Operario {
    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}

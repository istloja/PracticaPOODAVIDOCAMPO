/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_27_de_junio;

/**
 *
 * @author ITS LOJA
 */
public class Cubo extends Figura_tridimensional {
    public double calcularAreaTotal(double Arista){
        return 6*Math.pow(Arista,2);
    }
     public double calcularVolumen(double Arista){
        return Math.pow(Arista, 3);
    }
}

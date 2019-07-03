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
public class Esfera extends Figura_tridimensional {
    public double calcularArea(double radio){
        return 4*Math.PI*(radio*radio);
    }
    public double calcularVolumen(double radio){
        return (4/3)*Math.PI*(radio*radio*radio);
    }
}

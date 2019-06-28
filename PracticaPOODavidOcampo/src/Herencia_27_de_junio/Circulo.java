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
public class Circulo extends figura_bidimensional {
    public double calcularArea(double radio){
        return radio*Math.pow(Math.PI, 2);
    }
    public double calcularPerimetro(double radio){
        return radio*(2*Math.PI);
    }
}

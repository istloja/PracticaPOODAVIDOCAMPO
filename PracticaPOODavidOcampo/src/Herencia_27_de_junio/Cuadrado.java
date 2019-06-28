/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_27_de_junio;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Cuadrado extends figura_bidimensional {
 public double calcularArea(double lado){
        return Math.pow(lado,2);
    }
    public double calcularPerimetro(double lado){
        return 4*lado;
    
    }
}

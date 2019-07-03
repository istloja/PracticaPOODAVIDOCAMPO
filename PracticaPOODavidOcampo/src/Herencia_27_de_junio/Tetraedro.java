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
public class Tetraedro extends Figura_tridimensional{
    public double calcularArea(double Arista1){
        return Math.sqrt(3)*Math.pow(Arista1,2);
    }
    public double calcularVolumen(double Arista1){
        return (Math.sqrt(2)/12)*Math.pow(Arista1,3);
}
}

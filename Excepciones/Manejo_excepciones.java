/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Manejo_excepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = 0;
        try {//ponemos el codigo que queremos proteger
            numero = entrada.nextInt();
            System.out.println("el numero que ingresaste es el: " + numero);
        } catch (Exception b) {//ponemos la excepcion a capturar
            System.out.println("se genero un error " + b);
            System.out.println("Por favor ingrese un numero correcto");

        }
        System.out.println("El numero ingresado es: " + numero);
        try {
            int resultado = numero / 0;
            System.out.println("la respuesta es: "+resultado);
        } catch (Exception b) {
            //System.out.println("Se genero un error " + resultado);
            System.out.println("No hay como dividir para cero");
        }
    }
}

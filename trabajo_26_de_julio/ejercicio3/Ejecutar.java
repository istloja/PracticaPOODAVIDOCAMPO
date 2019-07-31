/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {
     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         System.out.println("ingrese el numerador");
         int num=entrada.nextInt();
         System.out.println("ingrese el denominador");
         int den=entrada.nextInt();
        Fraccion f = new Fraccion(num, den);
        System.out.println(f.toString());
        f.simplificar();
        System.out.println(f.toString());
        f.procesar();
        System.out.println(f.toString());
        System.out.println(f.getResultado());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para tener la informacion del empleado comercial");
        System.out.println("ingrese 2 para obtener la informacion del repartidor");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("ingrese la comision del empleado comercial");
                int comision = entrada.nextInt();
                System.out.println("ingrese el nombre");
                String nombre = entrada.next();
                System.out.println("ingrese la edad");
                int edad = entrada.nextInt();
                System.out.println("ingrese el salario");
                double salario = entrada.nextInt();
                Comercial objeto = new Comercial(comision, nombre, edad, salario);
                //llamamos al plus
                objeto.plus();
                System.out.println(objeto);
                break;
            case 2:
                System.out.println("ingrese la zona del repartidor");
                String zona = entrada.next();
                System.out.println("ingrese el nombre del repartidor");
                String nombre1 = entrada.next();
                System.out.println("ingrese la edad del repartidor");
                int edad1 = entrada.nextInt();
                System.out.println("ingrese el salario del repartidor");
                double salario1 = entrada.nextInt();

                Repartidor objeto1 = new Repartidor(zona, nombre1, edad1, salario1);

        //Llamamos a plus
                objeto1.plus();
                System.out.println(objeto1);
                break;
            default:
                System.out.println("ingrese un numero correcto:");
                break;
        }

    }
}

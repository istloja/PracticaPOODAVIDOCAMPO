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
public class Ejecutar_Tridimencionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para Esfera, 2 para Cubo y 3 para Tetraedro");
        int valor;
        valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("elegiste el Esfera");
                System.out.println("ingrese el radio de la Esfera");
                double radio=entrada.nextDouble();
                Esfera objeto=new Esfera();
                double areaEsfera=objeto.calcularArea(radio);
                double volumenEsfera=objeto.calcularVolumen(radio);
                System.out.println("el area de una esfera es: "+ areaEsfera+" y el perimetro de una esfera es: "+volumenEsfera);
                break;//este va despues de cada case
            case 2:
                System.out.println("elegiste el Cubo");
                System.out.println("ingrese la arista del cubo");
                double Arista=entrada.nextDouble();
                Cubo objeto1=new Cubo();
                double areaCubo=objeto1.calcularAreaTotal(Arista);
                double volumenCubo=objeto1.calcularVolumen(Arista);
                System.out.println("el area de un cubo es: "+ areaCubo+" y el volumen del cubo es: "+volumenCubo);
                break;
            case 3:
                System.out.println("elegiste el Tetraedro");
                System.out.println("ingrese la arista del tetraedro");
                double Arista1=entrada.nextDouble();
                Tetraedro objeto2=new Tetraedro();
                double areaTetraedro=objeto2.calcularArea(Arista1);
                double volumenTetraedro=objeto2.calcularVolumen(Arista1);
                System.out.println("el area de un tetraedro es: "+ areaTetraedro+" y el volumen del tetraedro es: "+volumenTetraedro);
                break;
            default:
                System.out.println("ingrese un numero correcto:");
                break;

        }
    }
}

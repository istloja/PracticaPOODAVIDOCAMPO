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
public class Ejecutar  {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para circulo, 2 para cuadrado y 3 para triangulo");
        int valor;
        valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("elegiste el circulo");
                System.out.println("ingrese el radio del circulo");
                double radio=entrada.nextDouble();
                Circulo objeto=new Circulo();
                double areacirculo=objeto.calcularArea(radio);
                double perimetroCirculo=objeto.calcularPerimetro(radio);
                System.out.println("el area de un circulo es: "+ areacirculo+" y el perimetro del circulo es: "+perimetroCirculo);
                break;//este va despues de cada case
            case 2:
                System.out.println("elegiste el cuadrado");
                System.out.println("ingrese el lado del cuadrado");
                double lado=entrada.nextDouble();
                Cuadrado objeto1=new Cuadrado();
                double areacuadrado=objeto1.calcularArea(lado);
                double perimetrocuadrado=objeto1.calcularPerimetro(lado);
                System.out.println("el area de un cuadrado es: "+ areacuadrado+" y el perimetro del cuadrado es: "+perimetrocuadrado);
                break;
            case 3:
                System.out.println("elegiste el triangulo");
                System.out.println("ingrese los lados del triangulopara calcular el area del triangulo");
                double lado1=entrada.nextDouble();
                double lado2=entrada.nextDouble();
                double lado3=entrada.nextDouble();
                Triangulo objeto2=new Triangulo();
                double areatriangulo=objeto2.calcularArea(lado1, lado2, lado3);
                System.out.println("el area del triangulo es: "+areatriangulo);
                System.out.println("ingrese la base y la a altura para calcular el perimetro del triangulo");
                double base=entrada.nextDouble();
                double altura=entrada.nextDouble();
                double perimetrotriangulo=objeto2.calcularPerimetro(base, altura);
                System.out.println("el perimetro del cuadrado es: "+perimetrotriangulo);
                break;
            default:
                System.out.println("ingrese un numero correcto:");
                break;

        }
    }
}

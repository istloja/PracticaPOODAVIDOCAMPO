/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Programacion;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Tipos_de_archivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para enlistar los numeros de archivos que estan en documentos");
        System.out.println("ingrese 2 para enlistar los numeros de archivos que estan en imagenes");
        System.out.println("ingrese 3 para enlistar los numeros de archivos que estan en musica");
        System.out.println("ingrese 4 para enlistar los numeros de archivos que estan en videos");
        System.out.println("ingrese 5 para enlistar los numeros de archivos que estan en Netbeans");
        try{
            int valor = entrada.nextInt();
            System.out.println("el valor ingresado es: " + valor);
            switch (valor) {
                case 1:
                    System.out.println("vamos a enlistar los archivos que estan en documentos");
                    File carpeta = new File("C:\\Users\\ITS LOJA\\Documents");
                    String[] arregloarchivos = carpeta.list();
                    for (int i = 0; i < arregloarchivos.length; i++) {
                        System.out.println(arregloarchivos[i]);
                    }
                    break;
                case 2:
                    System.out.println("vamos a enlistar los archivos que estan en imagenes");
                    File carpeta1 = new File("C:\\Users\\ITS LOJA\\Pictures");
                    String[] arregloarchivos2 = carpeta1.list();
                    for (int i = 0; i < arregloarchivos2.length; i++) {
                        System.out.println(arregloarchivos2[i]);
                    }
                    break;
                case 3:
                    System.out.println("vamos a enlistar los archivos que estan en musica");
                    File carpeta2 = new File("C:\\Users\\ITS LOJA\\Music");
                    String[] arregloarchivos1 = carpeta2.list();
                    for (int i = 0; i < arregloarchivos1.length; i++) {
                        System.out.println(arregloarchivos1[i]);
                    }
                    break;
                case 4:
                    System.out.println("vamos a enlistar los archivos que estan en videos");
                    File carpeta3 = new File("C:\\Users\\ITS LOJA\\Videos");
                    String[] arregloarchivos3 = carpeta3.list();
                    for (int i = 0; i < arregloarchivos3.length; i++) {
                        System.out.println(arregloarchivos3[i]);
                    }
                    break;
                case 5:
                    System.out.println("vamos a enlistar los archivos que estan en Netbeans");
                    File carpeta4 = new File("C:\\Users\\ITS LOJA\\Documents/NetBeansProjects");
                    String[] arregloarchivos5 = carpeta4.list();
                    for (int i = 0; i < arregloarchivos5.length; i++) {
                        System.out.println(arregloarchivos5[i]);
                    }
                    break;
                default:
                    System.out.println("ingrese un numero correcto:");
                    break;
            }
        }catch(Exception a){
            System.out.println("se produjo un error "+a);
            System.out.println("porfavor ingrese los numeros correctamente");
        }
    }
}

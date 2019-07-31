/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio_10;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class fichero_02 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero");
        String ruta=entrada.next();
        System.out.println("Introduce el texto que quieras escribir en el fichero");
        String texto=entrada.next();
        escribirFichero(ruta, texto);
 
        mostrarFicheroMay(ruta);
 
    }
 
    public static void escribirFichero(String nomFich, String texto){
        try(FileWriter fw=new FileWriter(nomFich);){
 
            //Escribimos el texto en el fichero
            fw.write(texto);
 
        }catch(Exception e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
    }
 
    public static void mostrarFicheroMay(String nomFich){
        try(FileReader fr=new FileReader (nomFich)){
 
            int valor=fr.read();
 
            while(valor!=-1){
 
                //Solo cambiara el caracter si es una minuscula o una mayuscula
                char caracter=(char)valor;
                if(caracter>=97 && caracter<=122){
                    caracter-=32;
                }else if(caracter>=65 && caracter<=90){
                    caracter+=32;
                }
                System.out.print(caracter);
                valor=fr.read();
            }
 
        }catch(Exception e){
            System.out.println("Problema con la E/S "+e);
        }
    }
 
}

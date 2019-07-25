/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class archivos {

//    public static void main(String[] args) {
//        File archivo = new File("C:\\Users\\ITS LOJA\\Desktop/documento.txt");//creando un objeto de la clase archivo
//        //en las comillas va el nombre y la direccion del archivo
//        System.out.println(archivo.exists());
//        //para saber si es una carpeta o no
//        System.out.println(archivo.isDirectory());
//        //para saber si es un archivo o no
//        System.out.println(archivo.isFile());
//        //para saber si un archivo esta oculto o no
//        System.out.println(archivo.isHidden());
//        //para saber la ultima fecha de modificacion
//        System.out.println(archivo.lastModified());
//        archivo.delete();
//        File carpeta = new File("C:\\Users\\ITS LOJA\\Desktop");
//        //carpeta.list devuelve un arreglo con los archivos de una carpeta
//        String[] arregloarchivos = carpeta.list();
//        for (int i = 0; i < arregloarchivos.length; i++) {
//            System.out.println(arregloarchivos[i]);
//
//        }
//
//    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el texto que desea guardar");
        String texto=entrada.nextLine();
        archivos objeto = new archivos();
        objeto.leerArchivo("C:\\Users\\ITS LOJA\\Desktop/texto.txt");
        objeto.escribirArchivo("C:\\Users\\ITS LOJA\\Desktop/texto.txt", texto);
        
    }

    public void leerArchivo(String direccion) {
        File archivo = new File(direccion);
        try {
            FileReader reader = new FileReader(archivo);//nos combierte un archivo en objeto
            BufferedReader recorrido = new BufferedReader(reader);//para recorrerlo
            String linea;
            while ((linea = recorrido.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirArchivo(String Direccion, String texto) {
        try {
            FileWriter archivo = new FileWriter(Direccion);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(texto);
            archivo.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

}

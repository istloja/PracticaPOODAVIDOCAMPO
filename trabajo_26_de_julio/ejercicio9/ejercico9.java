/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio9;

import java.io.FileReader;

/**
 *
 * @author ITS LOJA
 */
public class ejercico9 {
    public static void main(String[] args) {
        final String nomFichero="C:\\Users\\ITS LOJA\\Desktop/texto.txt";
        
        try(FileReader fr=new FileReader (nomFichero)){
 
            int valor=fr.read();
            while(valor!=-1){
                //Si el caracter es un espacio no lo escribe
                if(valor!=32){
                    System.out.print((char)valor);
                }
                valor=fr.read();
            }
        }catch(Exception e){
            System.out.println("Problemas con el E/S "+e);
        }
    }
}

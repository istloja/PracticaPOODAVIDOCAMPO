/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS LOJA
 */
public class Leer_y_Escribir {
    public void escribirObjeto(String Direccion,Personas persona){
        try {
            ObjectOutputStream escritor=new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(persona);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error "+e);
        }
        
    }
    public void leerArchivo(String Direccion){
        try {
            ObjectInputStream lector=new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar=lector.readObject();
            Personas persona=(Personas) auxiliar;//cambio de objeto a persona
            System.out.println("la persona se llama: "+persona.getNombre()+" "+ persona.getApellido()+" su edad es: "+persona.getEdad()+" años y su telefono es: "+persona.getTelefono());
            System.out.println(persona.getMascota().getNombre()+" su edad es: "+persona.getMascota().getEdad()+" Años");
        } catch (Exception e) {
            System.out.println("se produjo un error "+e);
        }
            
        }
    public void escribirLista(String Direccion, List<Personas> lista){
        try {
            ObjectOutputStream escritor=new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Personas persona : lista) {//para crear una lista
                escritor.writeObject(persona);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error "+e);
        }
        
    }
    public static void main(String[] args){
            Leer_y_Escribir objeto=new Leer_y_Escribir();
            Personas objeto1=new Personas("Samara", "Ocampo", 1564, 2, new Mascota("degolas",5,4));
            Personas objeto2=new Personas("Vanessa", "dominguez", 564816, 17,new Mascota("degolas",5,4));
            Personas objeto3=new Personas("Cisne", "Ocampo", 8454168, 14, new Mascota("princesa",5,4));
            Personas objetos=new Personas("David", "Ocampo",979625908,19,new Mascota("degolas",5,4));
            List <Personas> lista=new ArrayList<>();//creamos la lista para guardar objetos
            //una vez que creamos la lista, ponemos los objetos dentro de ella
            lista.add(objetos);
            lista.add(objeto1);
            lista.add(objeto2);
            lista.add(objeto3);
            //objeto.escribirObjeto("C:\\Users\\ITS LOJA\\Desktop\\pruebas.txt", objetos);
            //objeto.leerArchivo("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\pruebas.txt");
            objeto.escribirLista("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\pruebas.txt", lista);
        }
}

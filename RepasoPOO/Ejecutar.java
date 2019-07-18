/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {
    public static void main(String[] args) {
        Animal objeto = new Animal(5,"Jirafa",200,600,"Amarillo");
        System.out.println(objeto.InformacionAnimal());
        Ave objeto1 = new Ave(8,true,5,"gallina",8,30,"cafe");
        System.out.println(objeto1.InformacionAnimal());
        Mamifero objeto2 = new Mamifero(9,false,19,"elefante",600.5,400,"gris");
        System.out.println(objeto2.InformacionAnimal());
        Reptiles objeto3 = new Reptiles(true,false,10,true,2,"piton",600.5,400,"gris");
        System.out.println(objeto3.InformacionAnimal());
        Anfibios objeto4 = new Anfibios(true,false,10,true,true,2,"rana",5,10,"verde");
        System.out.println(objeto4.InformacionAnimal());
    }
}

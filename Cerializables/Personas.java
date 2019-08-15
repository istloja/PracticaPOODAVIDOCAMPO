/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerializables;

import java.io.Serializable;

/**
 *
 * @author ITS LOJA
 */
public class Personas implements Serializable {
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private int Edad;
    private  Mascota mascota;

    public Personas() {
    }

    public Personas(String Nombre, String Apellido, int Telefono, int Edad, Mascota mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.mascota = mascota;
    }



    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

   public static void main(String[] args) { 
        Personas objetos=new Personas("David", "Ocampo",979625908,19,new Mascota("degolas",5,4));
        System.out.println("la persona se llama: "+objetos.getNombre()+" "+ objetos.getApellido()+" su edad es: "+objetos.getEdad()+" su telefono es: "+objetos.getTelefono()+" y su mascota es: "+objetos.getMascota().getNombre()+" tiene la edad de: "+objetos.getMascota().getEdad()+" y tiene: "+objetos.getMascota().getNumero_de_patas()+" patas");
//        Personas obj=new Personas("Jostin", "Tarupi",654894561,15,new Mascota("dolar",2,4));
//        System.out.println("la persona se llama: "+obj.getNombre()+" "+ obj.getApellido()+" su edad es: "+obj.getEdad()+" su telefono es: "+obj.getTelefono()+" y su mascota es: "+obj.getMascota().getNombre()+" tiene la edad de: "+obj.getMascota().getEdad()+" y tiene: "+obj.getMascota().getNumero_de_patas()+" patas");
        
    }

  
    
}

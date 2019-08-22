/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.Serializable;

/**
 *
 * @author ITS LOJA
 */
public class Jugador implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
   
    public static void main(String[] args) {
        Jugador objeto=new Jugador("Leonel", "Messi", 33, 400, 2004, new Equipo("Barcelona", 74, "España"));
        System.out.println("el jugador se llama se llama: " + objeto.getNombre() + " " + objeto.getApellido() + " su edad es: " + objeto.getEdad() + " sus numeros de goles son " + objeto.getNumeroGoles()+ " su año de debut es: " + objeto.getAñoDebut() + " su equipo es: " + objeto.getEquipo().getNombre() + " tiene "+objeto.getEquipo().getNumerotitulos()+" y es de "+objeto.getEquipo().getCiudad());
        
        
    }
}

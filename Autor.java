/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerializables;

/**
 *
 * @author ITS LOJA
 */
public class Autor {
    private String Nombre_Autor;
    private int edad;
    private int libros_escritos;

    public Autor() {
    }

    public Autor(String Nombre_Autor, int edad, int libros_escritos) {
        this.Nombre_Autor = Nombre_Autor;
        this.edad = edad;
        this.libros_escritos = libros_escritos;
    }

    public String getNombre_Autor() {
        return Nombre_Autor;
    }

    public void setNombre_Autor(String Nombre_Autor) {
        this.Nombre_Autor = Nombre_Autor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLibros_escritos() {
        return libros_escritos;
    }

    public void setLibros_escritos(int libros_escritos) {
        this.libros_escritos = libros_escritos;
    }
    
}

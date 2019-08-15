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
public class Mascota implements Serializable {
    private String Nombre;
    private int Edad;
    private int Numero_de_patas;

    public Mascota() {
    }

    public Mascota(String Nombre, int Edad, int Numero_de_patas) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Numero_de_patas = Numero_de_patas;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumero_de_patas() {
        return Numero_de_patas;
    }

    public void setNumero_de_patas(int Numero_de_patas) {
        this.Numero_de_patas = Numero_de_patas;
    }
    
}

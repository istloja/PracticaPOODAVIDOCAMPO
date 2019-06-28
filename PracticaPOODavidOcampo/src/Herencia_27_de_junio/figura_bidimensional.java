/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_27_de_junio;

import herencia_21_06_19.Persona;

/**
 *
 * @author ITS LOJA
 */
public class figura_bidimensional extends Figura {
    private String tipodefigura;
    private float datos;

    public String getTipodefigura() {
        return tipodefigura;
    }

    public void setTipodefigura(String tipodefigura) {
        this.tipodefigura = tipodefigura;
    }

    public float getDatos() {
        return datos;
    }

    public void setDatos(float datos) {
        this.datos = datos;
    }
    public void nombrefiguras(){
        System.out.println("hola tenemos las figuras como: cuadrado, triangulo y circulo");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_del_arbol;

/**
 *
 * @author ITS LOJA
 */
public class Abuela extends Persona{
    Hijo nieto;
    Hija nieta;
    Padre hijo;
    Madre hierna;

    public Hijo getNieto() {
        return nieto;
    }

    public void setNieto(Hijo nieto) {
        this.nieto = nieto;
    }

    public Hija getNieta() {
        return nieta;
    }

    public void setNieta(Hija nieta) {
        this.nieta = nieta;
    }

    public Padre getHijo() {
        return hijo;
    }

    public void setHijo(Padre hijo) {
        this.hijo = hijo;
    }

    public Madre getHierna() {
        return hierna;
    }

    public void setHierna(Madre hierna) {
        this.hierna = hierna;
    }
    public Abuela(){
    setNombres_y_Apellidos("Enith Carmita Tarupi Conde");
    setEdad(80);
    setColor_de_Cabello("negro oscuro");
    setGenero("Femenino");
    setOcupacion("Trabaja en una tienda de abarrotes");
    setNumero_de_hijos(9);
    setDireccion("Lauro Gerrero y rocafuerte");
}
}

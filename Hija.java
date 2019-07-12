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
public class Hija extends Persona{
    Madre madre;
    Padre padre;
    Abuela abuela;
    Abuelo abuelo;

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public Abuela getAbuela() {
        return abuela;
    }

    public void setAbuela(Abuela abuela) {
        this.abuela = abuela;
    }

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
    }
    public Hija(){
    setNombres_y_Apellidos("Cisne Yamileth Ocampo Beltran");
    setEdad(14);
    setGenero("Femenino");
    setOcupacion("Estudiante en el Colegio Pio Jaramillo Alvarado");
    setColor_de_Cabello("cafe oscuro");
    setDireccion("Las Peñas");
}
}

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
public class Padre extends Persona {
   Madre esposa;
   Abuelo Papá;
   Abuela Mamá;
   Hijo hijo;
   Hija hija;

    public Madre getEsposa() {
        return esposa;
    }

    public void setEsposa(Madre esposa) {
        this.esposa = esposa;
    }

    public Abuelo getPapá() {
        return Papá;
    }

    public void setPapá(Abuelo Papá) {
        this.Papá = Papá;
    }

    public Abuela getMamá() {
        return Mamá;
    }

    public void setMamá(Abuela Mamá) {
        this.Mamá = Mamá;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public Hija getHija() {
        return hija;
    }

    public void setHija(Hija hija) {
        this.hija = hija;
    }
    public Padre(){
    setNombres_y_Apellidos("David Rene Ocampo Tarupi");
    setEdad(40);
    setGenero("Masculino");
    setOcupacion("Descansar en el cielo");
    setColor_de_Cabello("negro oscuro");
    setNumero_de_hijos(3);
    setDireccion("el cielo");
}
}

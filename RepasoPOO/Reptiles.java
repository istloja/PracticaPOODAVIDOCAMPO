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
public class Reptiles extends Animal{
    private boolean Se_arrastran;
    private boolean Nacen_de_huevos;
    private int numero_de_huevos;
    private boolean escamas;

    public Reptiles() {
    }

    public Reptiles(boolean Se_arrastran, boolean Nacen_de_huevos, int numero_de_huevos, boolean escamas, int Edad, String Nombre, double Peso, double Altura, String Color) {
        super(Edad, Nombre, Peso, Altura, Color);
        this.Se_arrastran = Se_arrastran;
        this.Nacen_de_huevos = Nacen_de_huevos;
        this.numero_de_huevos = numero_de_huevos;
        this.escamas = escamas;
    }

    public boolean isSe_arrastran() {
        return Se_arrastran;
    }

    public void setSe_arrastran(boolean Se_arrastran) {
        this.Se_arrastran = Se_arrastran;
    }

    public boolean isNacen_de_huevos() {
        return Nacen_de_huevos;
    }

    public void setNacen_de_huevos(boolean Nacen_de_huevos) {
        this.Nacen_de_huevos = Nacen_de_huevos;
    }

    public int getNumero_de_huevos() {
        return numero_de_huevos;
    }

    public void setNumero_de_huevos(int numero_de_huevos) {
        this.numero_de_huevos = numero_de_huevos;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }
    
}

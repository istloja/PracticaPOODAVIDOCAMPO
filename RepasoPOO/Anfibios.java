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
public class Anfibios extends Animal{
     private boolean Se_arrastran;
    private boolean Nacen_de_huevos;
    private int numero_de_Huevos;
    private boolean tienen_cuello;
    private boolean nadan;

    public Anfibios() {
    }

    public Anfibios(boolean Se_arrastran, boolean Nacen_de_huevos, int numero_de_Huevos, boolean tienen_cuello, boolean nadan, int Edad, String Nombre, double Peso, double Altura, String Color) {
        super(Edad, Nombre, Peso, Altura, Color);
        this.Se_arrastran = Se_arrastran;
        this.Nacen_de_huevos = Nacen_de_huevos;
        this.numero_de_Huevos = numero_de_Huevos;
        this.tienen_cuello = tienen_cuello;
        this.nadan = nadan;
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

    public int getNumero_de_Huevos() {
        return numero_de_Huevos;
    }

    public void setNumero_de_Huevos(int numero_de_Huevos) {
        this.numero_de_Huevos = numero_de_Huevos;
    }

    public boolean isTienen_cuello() {
        return tienen_cuello;
    }

    public void setTienen_cuello(boolean tienen_cuello) {
        this.tienen_cuello = tienen_cuello;
    }

    public boolean isNadan() {
        return nadan;
    }

    public void setNadan(boolean nadan) {
        this.nadan = nadan;
    }
    
}

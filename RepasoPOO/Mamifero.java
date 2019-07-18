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
public class Mamifero extends Animal{
      private int tiempo_de_gestacion;
      private boolean pelaje;

    public Mamifero() {
    }

    public Mamifero(int tiempo_de_gestacion, boolean pelaje, int Edad, String Nombre, double Peso, double Altura, String Color) {
        super(Edad, Nombre, Peso, Altura, Color);
        this.tiempo_de_gestacion = tiempo_de_gestacion;
        this.pelaje = pelaje;
    }
      

    public int getTiempo_de_gestacion() {
        return tiempo_de_gestacion;
    }

    public void setTiempo_de_gestacion(int tiempo_de_gestacion) {
        this.tiempo_de_gestacion = tiempo_de_gestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
       
}

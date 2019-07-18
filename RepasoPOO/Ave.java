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
public class Ave extends Animal {
   private int Numero_de_huevos;
   private boolean vuela;
   public Ave(){
       
   }

    public Ave(int Numero_de_huevos, boolean vuela, int Edad, String Nombre, double Peso, double Altura, String Color) {
        super(Edad, Nombre, Peso, Altura, Color);
        this.Numero_de_huevos = Numero_de_huevos;
        this.vuela = vuela;
    }
   

    public int getNumero_de_huevos() {
        return Numero_de_huevos;
    }

    public void setNumero_de_huevos(int Numero_de_huevos) {
        this.Numero_de_huevos = Numero_de_huevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
  
}

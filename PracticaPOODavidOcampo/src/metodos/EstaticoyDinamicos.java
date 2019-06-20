/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ITS LOJA
 */
public class EstaticoyDinamicos {
    public static void main(String[] args) {
        saludar();//para llamar un metodo estatico
        // si quiero llamara a despedir debo crear un objeto
        EstaticoyDinamicos objeto=new EstaticoyDinamicos();//creo un objeto
        objeto.despedir();
    }
    public static void saludar(){
        System.out.println("Hola");
    }
    public void despedir() {
        System.out.println("Chao");
    }

  
}

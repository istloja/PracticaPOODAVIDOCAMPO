/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas_y_Colas;

/**
 *
 * @author ITS LOJA
 */
public class Principal {
    public static void pila(){
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        System.out.println(""+pila.quitar());
        System.out.println(""+pila.quitar());
        System.out.println(""+pila.quitar());
        System.out.println(""+pila.quitar());
        System.out.println(""+pila.quitar());
        System.out.println(""+pila.quitar());
    }
    public static void cola(){
        ColaLista cola=new ColaLista();
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        
        System.out.println(""+cola.quitar());
        System.out.println(""+cola.quitar());
        System.out.println(""+cola.quitar());
        System.out.println(""+cola.quitar());
        System.out.println(""+cola.quitar());
        System.out.println(""+cola.quitar());
    }
    public static void main(String[] args) {
        pila();
        //cola();
        
    }
    public static void println (String numero){
        System.out.println(numero);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio8;

/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {
    public  static void main (String[] args){
        
       Producto ListaProductos[]=new Producto[3];
       
       ListaProductos[0]=new Producto("producto1", 20);
       ListaProductos[1]=new Perecedero(1, "producto2",20);
       ListaProductos[2]=new No_Perecedero("tipo 1", "producto 3", 1);
       
     
       
       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=suma+ListaProductos[i].Calcular(5);
       }
        System.out.println("El precio tatal de productos es: "+suma);
      
      
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio5;

/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {
    	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		libro l1 = new libro(66273737, "ecuaciones", "larson", 500);
		libro l2 = new libro(58585858,"el camino del amor","nicholas Spark",300);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		if (l1.getNumPagi()>l2.getNumPagi()) {
			System.out.println("El libro "+l1.getTitulo()+" tiene mas numeros de paginas que el libro "+l2.getTitulo());
		}else {
			System.out.println("El libro "+l2.getTitulo()+" tiene mas numeros de paginas que el libro "+l1.getTitulo());
		}
		

	}
}

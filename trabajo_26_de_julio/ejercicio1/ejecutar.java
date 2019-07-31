/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class ejecutar {
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
String nombre, numero;
double tipo, importe;
Cuenta cuenta1 = new Cuenta();

System.out.print("Nombre : ");
nombre = sc.nextLine();
System.out.print("Número de cuenta : ");
numero = sc.nextLine();
System.out.print("Tipo de interes : ");
tipo = sc.nextDouble();
System.out.print("Saldo: ");
importe = sc.nextDouble();

cuenta1.setNombre_cliente(nombre);
cuenta1.setNum_cuenta(numero);
cuenta1.setTipo_interes(tipo);
cuenta1.setSaldo(importe);
Cuenta cuenta2 = new Cuenta("David Rene Ocampo", "12345678901234567890", 1.75, 300);
Cuenta cuenta3 = new Cuenta(cuenta1);
System.out.println("Datos de la cuenta 1");
System.out.println("Nombre del titular: " + cuenta1.getNombre_cliente());
System.out.println("Número de cuenta: " + cuenta1.getNum_cuenta());
System.out.println("Tipo de interés: " + cuenta1.getTipo_interes());
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println();
cuenta1.Ingreso(4000);
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println("Datos de la cuenta 2");
System.out.println("Nombre del titular: " + cuenta2.getNombre_cliente());
System.out.println("Número de cuenta: " + cuenta2.getNum_cuenta());
System.out.println("Tipo de interés: " + cuenta2.getTipo_interes());
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
System.out.println("Datos de la cuenta 3");
System.out.println("Nombre del titular: " + cuenta3.getNombre_cliente());
System.out.println("Número de cuenta: " + cuenta3.getNum_cuenta());
System.out.println("Tipo de interés: " + cuenta3.getTipo_interes());
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
cuenta3.transferencia(cuenta2, 10);
System.out.println("Saldo de la cuenta 2");
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
System.out.println("Saldo de la cuenta 3");
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
}
}

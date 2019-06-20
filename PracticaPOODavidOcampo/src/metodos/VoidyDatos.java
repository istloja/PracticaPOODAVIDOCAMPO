/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 * mostrar las diferencias entre los metodos void y los que devuelven datos de tipo objeto y tipos primarios
 */
public class VoidyDatos {
    // es un metodo de tipo void que suma dos numeros y presenta el resultado
    public  void sumar(int numero1, int numero2) {//recibe dos numeros de tipo entero
        System.out.println("la suma es: "+(numero1+numero2));
//    
    }
//    //los metodos que devuelven datos pueden ser diferentes tipos como
//    // int. double, String, char, booleno y tambien puede ser objetos
    public int sumar1(int numero1, int numero2){
        return numero1+numero2;
    }
    public String unirCadenas(String cadena1, String cadena2){
        return cadena1+cadena2;
    }
    public double suma2(double num1,double num2){
        return num1+num2;
    }
    public boolean iniciaSesion(String usuario, String password){
        boolean valor=false;
        if(usuario.equals("admin")&& password.equals("1234")){
            valor=true;
        }
        return valor;
    }
     public boolean iniciaSesion1(String usuario, String password){
        
        boolean valor=false;
        if(usuario.equals("admin")&& password.equals("1234")){
            valor=true;
        }
        return valor;
    }
    public static void main(String[] args) {
        VoidyDatos objeto= new VoidyDatos();
        objeto.sumar(10, 8);
        objeto.sumar(11, 23);
        objeto.sumar(80, 7);
        int resultado=objeto.sumar1(40, 10);//guardo lo que devuelve el metodo sumar1
        System.out.println("la suma es: "+ resultado);
        String cadenasunidas=objeto.unirCadenas("Hola ", "mundo");
        System.out.println("la cadena unida es: "+ cadenasunidas);
        double resultado1=objeto.suma2(25.5, 8.4);
        System.out.println("la suma es: "+resultado1);
        boolean respuesta=objeto.iniciaSesion("usuario", "contraseña");
        System.out.println("la cuenta es: "+respuesta);
        
       Scanner entrada= new Scanner(System.in);
       String usuario, password;
         System.out.println("ingrese el usuario");
         usuario= entrada.next();
         System.out.println("ingrese la contraseña");
         password= entrada.next();
         boolean iniciosesion=objeto.iniciaSesion1(usuario, password);
         if(iniciosesion){
            System.out.println("bienvenido al sistema");
        }else{
            System.out.println("usuario o contaseña incorrectos");
        }
}
}

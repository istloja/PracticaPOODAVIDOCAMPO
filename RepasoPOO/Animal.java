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
public class Animal {
    private int Edad;
    private String Nombre;
    private double Peso;
    private double Altura;
    private String Color;
    public Animal(){
        
    }

    public Animal(int Edad, String Nombre, double Peso, double Altura, String Color) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Color = Color;
    }

   

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void NombreAnimal(){
    System.out.println("hola soy un animal");
    } 
    public String InformacionAnimal(){
        String Informacion=" "+Nombre+" de color "+Color+" tiene "+Edad+" años "+" y una altura de "+Altura+" centimetros "+" y un peso de "+Peso+" kilos";
        return Informacion;
    }
    public static void main(String[] args) {
        Animal objeto = new Animal();
        objeto.setNombre("Perro");
        objeto.setEdad(10);
        objeto.setAltura(100);
        objeto.setPeso(15);
        objeto.setColor("negro");
        System.out.println(objeto.InformacionAnimal());
        Animal objeto1=new Animal(5,"Gato",10,120,"gris");
        System.out.println(objeto1.InformacionAnimal());
    }
}

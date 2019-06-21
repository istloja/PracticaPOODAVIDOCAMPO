/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_21_06_19;

/**
 *
 * @author ITS LOJA
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private int cedula;
    private int telefono;
    private String direccion;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public void saludar() {
        System.out.println("Hola");
    }

    public void despedirse() {
        System.out.println("Chao");
    }

    public static void main(String[] args) {
        Persona primerobjeto = new Persona();//he creado mi primer objeto
        primerobjeto.setNombre("Manuel");
        System.out.println(primerobjeto.getNombre());
        primerobjeto.saludar();// llama a un objeto
        primerobjeto.despedirse();

    }
}
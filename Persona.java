/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_del_arbol;

/**
 *
 * @author ITS LOJA
 */
public class Persona {
     private String Nombres_y_Apellidos;
    
    private String Color_de_Cabello;
    private String Direccion;
    private String Genero;
    private String Ocupacion;
    private int Edad;
    private int Cedula;
    private int telefono;
    private int Numero_de_hijos;

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public int getNumero_de_hijos() {
        return Numero_de_hijos;
    }

    public void setNumero_de_hijos(int Numero_de_hijos) {
        this.Numero_de_hijos = Numero_de_hijos;
    }


    public String getNombres_y_Apellidos() {
        return Nombres_y_Apellidos;
    }


    public void setNombres_y_Apellidos(String Nombres_y_Apellidos) {
        this.Nombres_y_Apellidos = Nombres_y_Apellidos;
    }


    public String getColor_de_Cabello() {
        return Color_de_Cabello;
    }

    public void setColor_de_Cabello(String Color_de_Cabello) {
        this.Color_de_Cabello = Color_de_Cabello;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}

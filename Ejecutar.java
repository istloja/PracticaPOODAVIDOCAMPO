/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_del_arbol;


import java.util.Scanner;


/**
 *
 * @author ITS LOJA
 */
public class Ejecutar {
    public static void main(String[] args) {
        Hijo hijo=new Hijo();
        Hija hija=new Hija();
        Madre madre=new Madre();
        Padre padre=new Padre();
        Abuelo abuelo=new Abuelo();
        Abuela abuela=new Abuela();
        hijo.setPadre(padre);
        hijo.setMadre(madre);
        hija.setPadre(padre);
        hija.setMadre(madre);
        madre.setHijo(hijo);
        padre.setHijo(hijo);
        madre.setHija(hija);
        padre.setHija(hija);
        madre.setEsposo(padre);
        padre.setEsposa(madre);
        abuelo.setHierna(madre);
        abuela.setHierna(madre);
        abuela.setNieta(hija);
        abuela.setNieto(hijo);
        abuelo.setNieto(hijo);
        abuelo.setNieta(hija);
        hijo.setAbuela(abuela);
        hijo.setAbuelo(abuelo);
        hija.setAbuela(abuela);
        hija.setAbuelo(abuelo);
        padre.setPapá(abuelo);
        padre.setMamá(abuela);
        abuelo.setHijo(padre);
        abuela.setHijo(padre);
        System.out.println("los nombres del padre de: "+hijo.getNombres_y_Apellidos()+" y "+hija.getNombres_y_Apellidos()+" son: "+ hijo.getPadre().getNombres_y_Apellidos());
        System.out.println("mi padre: "+padre.getNombres_y_Apellidos()+" vive en: "+ padre.getDireccion());
        System.out.println("la edad de "+padre.getNombres_y_Apellidos()+" es: "+padre.getEdad()+" años");
        System.out.println("el color de cabello de: "+padre.getNombres_y_Apellidos()+" es: "+padre.getColor_de_Cabello());
        System.out.println("la mama de: "+padre.getNombres_y_Apellidos()+" es: "+padre.getMamá().getNombres_y_Apellidos()+" y el papa es: "+padre.getPapá().getNombres_y_Apellidos());
        System.out.println("los nombres de la madre de: "+hijo.getNombres_y_Apellidos()+" y "+hija.getNombres_y_Apellidos()+" son: "+ hijo.getMadre().getNombres_y_Apellidos());
        System.out.println("mi madre: "+madre.getNombres_y_Apellidos()+" vive en: "+ madre.getDireccion());
        System.out.println("la edad de "+madre.getNombres_y_Apellidos()+" es: "+madre.getEdad()+" años");
        System.out.println("el color de cabello de: "+madre.getNombres_y_Apellidos()+" es: "+madre.getColor_de_Cabello());
        System.out.println("nombre del hijo de "+ madre.getNombres_y_Apellidos()+" y " + padre.getNombres_y_Apellidos()+ " es: "+ madre.getHijo().getNombres_y_Apellidos());
        System.out.println("yo: "+hijo.getNombres_y_Apellidos()+" vivo en: "+ hijo.getDireccion());
        System.out.println("la edad de "+hijo.getNombres_y_Apellidos()+" es: "+hijo.getEdad()+" años");
        System.out.println("el color de cabello de: "+hijo.getNombres_y_Apellidos()+" es: "+hijo.getColor_de_Cabello());
        System.out.println("nombre de la hija de "+ madre.getNombres_y_Apellidos()+" y "+ padre.getNombres_y_Apellidos()+  " es: "+ madre.getHija().getNombres_y_Apellidos());
        System.out.println("mi hermana: "+hija.getNombres_y_Apellidos()+" vive en: "+ hija.getDireccion());
        System.out.println("la edad de "+hija.getNombres_y_Apellidos()+" es: "+hija.getEdad()+" años");
        System.out.println("el color de cabello de: "+hija.getNombres_y_Apellidos()+" es: "+hija.getColor_de_Cabello());
        System.out.println("la hierna de : "+abuelo.getNombres_y_Apellidos()+" y "+ abuela.getNombres_y_Apellidos()+ " es: "+abuelo.getHierna().getNombres_y_Apellidos());
        System.out.println("el nieto de: "+abuela.getNombres_y_Apellidos()+" y "+abuelo.getNombres_y_Apellidos()+  " es: "+ abuela.getNieto().getNombres_y_Apellidos());
        System.out.println("la nieta de: "+abuela.getNombres_y_Apellidos()+" y "+abuelo.getNombres_y_Apellidos()+  " es: "+ abuelo.getNieta().getNombres_y_Apellidos());
        System.out.println("la abuela de:"+ hija.getNombres_y_Apellidos()+" y "+hijo.getNombres_y_Apellidos() +" es: "+hijo.getAbuelo().getNombres_y_Apellidos());
        System.out.println("el abuelo de:"+ hija.getNombres_y_Apellidos()+" y "+hijo.getNombres_y_Apellidos()+" es: "+hija.getAbuelo().getNombres_y_Apellidos());
        System.out.println("el hijo de: "+abuelo.getNombres_y_Apellidos()+" y "+ abuela.getNombres_y_Apellidos()+ " es: "+abuelo.getHijo().getNombres_y_Apellidos() );
        System.out.println("mi abuelo: "+abuelo.getNombres_y_Apellidos()+" vive en: "+ abuelo.getDireccion());
        System.out.println("la edad de "+abuelo.getNombres_y_Apellidos()+" es: "+abuelo.getEdad()+" años");
        System.out.println("el color de cabello de: "+abuelo.getNombres_y_Apellidos()+" es: "+abuelo.getColor_de_Cabello());
        System.out.println("mi abuela: "+abuela.getNombres_y_Apellidos()+" vive en: "+ abuela.getDireccion());
        System.out.println("la edad de "+abuela.getNombres_y_Apellidos()+" es: "+abuela.getEdad()+" años");
        System.out.println("el color de cabello de: "+abuela.getNombres_y_Apellidos()+" es: "+abuela.getColor_de_Cabello());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS LOJA
 */
public class Jugador implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void escribirObjeto(String Direccion, Jugador jugador) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(jugador);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirLista(String Direccion, List<Jugador> lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Jugador jugador : lj) {//para crear una lista
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Jugador jugador = (Jugador) auxiliar;//cambio de objeto a persona
            System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Jugador> LeerJugadores(String dire) {
        List<Jugador> lj = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                lj.add(jugador);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lj;

    }

    public void LeerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public Jugador edadMayor(List<Jugador> lj) {
        Jugador edadmayor = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("la edad mayor es: " + edadmayor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() > edadmayor.getEdad()) {
                edadmayor = jugador;
            }
        }
        return edadmayor;
    }

    public Jugador edadMenor(List<Jugador> lj) {
        Jugador edadmenor = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("la edad mayor es: " + edadmenor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() < edadmenor.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lj) {
        Jugador masgoles = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("el numero mayor de goles es: " + masgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (masgoles.getNumeroGoles() < jugador.getNumeroGoles()) {
                masgoles = jugador;
            }
        }
        return masgoles;
    }

    public Jugador menosGoles(List<Jugador> lj) {
        Jugador menosgoles = lj.get(0);
        for (Jugador jugador : lj) {
//            System.out.println("el numero menor de goles es: " + menosgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (menosgoles.getNumeroGoles() > jugador.getNumeroGoles()) {
                menosgoles = jugador;
            }
        }
        return menosgoles;
    }

    public Jugador debutP(List<Jugador> lj) {
        Jugador debuto = lj.get(0);
        for (Jugador jugador : lj) {
            if (debuto.getAñoDebut() > jugador.getAñoDebut()) {
                debuto = jugador;
            }

        }
        return debuto;
    }

    public Jugador Titulos(List<Jugador> lj) {
        Jugador masTitulos = lj.get(0);
        for (Jugador jugador : lj) {
            if (masTitulos.getEquipo().getNumerotitulos() < jugador.getEquipo().getNumerotitulos()) {
                masTitulos = jugador;
            }

        }
        return masTitulos;
    }


    public static void main(String[] args) {
        Jugador objetos = new Jugador();
        Jugador e1 = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"));
        Jugador e2 = new Jugador("Leonel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador e3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador e4 = new Jugador("Eden", "hazard", 27, 590, 2010, new Equipo("Real Madrid", 40, "Madrid"));
        List<Jugador> lj = new ArrayList<>();
        lj.add(e1);
        lj.add(e2);
        lj.add(e3);
        lj.add(e4);
//        System.out.println(lj.size());
//        int c = lj.size();
//        System.out.println(c);
//        for (Jugador jugador : lj) {
//            System.out.println(jugador.getNombre());
//        }
//        objetos.leerArchivo("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt");
        objetos.escribirLista("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\leccion.txt", lj);
        //objetos.escribirObjeto("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt", e4);
//        objetos.LeerLista("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\leccion.txt");
//        objetos.GuardarLista("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt");
        List<Jugador> b = objetos.LeerJugadores("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt");
//        for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad() + " años");
//        }
System.out.println("la edad mayor de los jugadores es: "+objetos.edadMayor(b).getEdad());
System.out.println("la edad menor de los jugadores es: "+objetos.edadMenor(b).getEdad());
        System.out.println("el mayor numero de goles es: " + objetos.masGoles(b).getNumeroGoles());
        System.out.println("el numero menor de goles es:" + objetos.menosGoles(b).getNumeroGoles());
        System.out.println("el año de debut es: " + objetos.debutP(b).getAñoDebut());
        System.out.println("el numero de titulos maximo es: " + objetos.Titulos(b).getEquipo().getNumerotitulos());
    }
}

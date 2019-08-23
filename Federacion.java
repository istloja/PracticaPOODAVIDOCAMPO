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
public class Federacion implements Serializable {
    private String Nombre;
    private String Pais;
    private int Equipos;
    private int Numjugadores;
    private int NumCategorias;
    private int AñoFundacion;
    public Federacion() {
    }

    public Federacion(String Nombre, String Pais, int Equipos, int Numjugadores, int NumCategorias, int AñoFundacion) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Equipos = Equipos;
        this.Numjugadores = Numjugadores;
        this.NumCategorias = NumCategorias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getEquipos() {
        return Equipos;
    }

    public void setEquipos(int Equipos) {
        this.Equipos = Equipos;
    }

    public int getNumjugadores() {
        return Numjugadores;
    }

    public void setNumjugadores(int Numjugadores) {
        this.Numjugadores = Numjugadores;
    }

    public int getNumCategorias() {
        return NumCategorias;
    }

    public void setNumCategorias(int NumCategorias) {
        this.NumCategorias = NumCategorias;
    }

    public int getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(int AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }
    public void escribirObjeto(String Direccion, Federacion fede) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(fede);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
    public void escribirLista(String Direccion, List<Federacion> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Federacion fede : lista) {//para crear una lista
                escritor.writeObject(fede);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
    public List<Federacion> leerFederacion(String dire) {
        List<Federacion> lista = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Federacion fede = (Federacion) auxiliar;
                lista.add(fede);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lista;

    }
     public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Federacion fede = (Federacion) auxiliar;//cambio de objeto a persona
            System.out.println("la Federacion se llama: " + fede.getNombre() + " del pais de  " + fede.getPais()+ " hay: " + fede.getEquipos() + " equipos de " + fede.getNumjugadores()+ " jugadores y " + fede.getNumCategorias() + " categorias y su fundacion fue en el año de "+fede.getAñoFundacion());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
     
    public void LeerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Federacion fede = (Federacion) auxiliar;
                System.out.println("la Federacion se llama: " + fede.getNombre() + " del pais de  " + fede.getPais()+ " hay: " + fede.getEquipos() + " equipos de " + fede.getNumjugadores()+ " jugadores y " + fede.getNumCategorias() + " categorias y su fundacion fue en el año de "+fede.getAñoFundacion());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
    public int fundacionP(List<Federacion> lista) {
        int prontafundacion = lista.get(0).getAñoFundacion();
        for (Federacion fede : lista) {
            System.out.println("la edad mayor es: " + prontafundacion + " la edad del objeto es " + fede.getAñoFundacion());
            if (prontafundacion < fede.getAñoFundacion()) {
                prontafundacion = fede.getAñoFundacion();
            }
        }
        return prontafundacion;
    }
    public Federacion masEquipos(List<Federacion> lista) {
        Federacion masequipos = lista.get(0);
        for (Federacion fede : lista) {
            //System.out.println("la edad mayor es: " + edadmayor + " la edad del objeto es " + jugador.getEdad());
            if (fede.getAñoFundacion()< masequipos.getAñoFundacion()) {
                masequipos = fede;
            }
        }
        return masequipos;
    }
    public static void main(String[] args) {
        Federacion objetos = new Federacion();
        Federacion f1=new Federacion("Federacion Ecuatoriana de Futbol", "Ecuador", 6, 11, 3,1995);
        Federacion f2=new Federacion("Federacion Mexicana de Futbol", "Mexico", 6, 11, 4,1922);
        Federacion f3=new Federacion("Federacion Española de Futbol", "España", 11, 11, 6,1913);
        Federacion f4=new Federacion("Asociacion del Futbol Argentino", "Argentina", 6, 11, 2,1983);
        List<Federacion> lista=new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        System.out.println(lista.size());
        int c = lista.size();
        System.out.println(c);
        objetos.escribirLista("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\federacion.txt", lista);
//        objetos.escribirObjeto("C:\\Users\\ITS LOJA\\Desktop\\federacion.txt", f4);
objetos.LeerLista("C:\\Users\\ITS LOJA\\Desktop\\federacion.txt");
        objetos.leerFederacion("C:\\Users\\ITS LOJA\\Desktop\\federacion.txt");
        List<Federacion> b = objetos.leerFederacion("C:\\Users\\ITS LOJA\\Desktop\\federacion.txt");
//        for (Federacion fede : b) {
//
//}
        objetos.fundacionP(lista);
        objetos.masEquipos(b).getEquipos();
}
}

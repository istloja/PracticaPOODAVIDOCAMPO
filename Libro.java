/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerializables;

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
public class Libro implements Serializable {
    private String Nombre;
    private Autor Autor;
    private int Num_Pag;
    private int Temporadas;
    private double costo;
    private int Año_publicado;

    public Libro() {
    }

    public Libro(String Nombre, Autor Autor, int Num_Pag, int Temporadas, double costo, int Año_publicado) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Num_Pag = Num_Pag;
        this.Temporadas = Temporadas;
        this.costo = costo;
        this.Año_publicado = Año_publicado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public int getNum_Pag() {
        return Num_Pag;
    }

    public void setNum_Pag(int Num_Pag) {
        this.Num_Pag = Num_Pag;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAño_publicado() {
        return Año_publicado;
    }

    public void setAño_publicado(int Año_publicado) {
        this.Año_publicado = Año_publicado;
    }
     public void escribirObjeto(String Direccion, Libro obj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(obj);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
    public void escribirLista(String Direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Libro obj : lista) {//para crear una lista
                escritor.writeObject(obj);
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
            Libro obj = (Libro) auxiliar;//cambio de objeto a persona
            System.out.println("el libro se llama "+obj.getNombre()+" tiene "+obj.getNum_Pag()+" Paginas y tiene "+obj.getTemporadas()+" Temporadas fue publicado en el año de: "+obj.getAño_publicado()+" y cuesta "+obj.getCosto()+" Dolares y el autor es: "+obj.getAutor().getNombre_Autor()+" escribio loa obra a la edad de: "+obj.getAutor().getEdad()+" Y ha escrito "+obj.getAutor().getLibros_escritos()+" Libros");
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }
     public List<Libro> LeerLibros(String dire) {
        List<Libro> lista = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro obj = (Libro) auxiliar;
                lista.add(obj);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lista;

    }
     public void LeerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro obj = (Libro) auxiliar;
                System.out.println("el libro se llama "+obj.getNombre()+" tiene "+obj.getNum_Pag()+" Paginas y tiene "+obj.getTemporadas()+" Temporadas fue publicado en el año de: "+obj.getAño_publicado()+" y cuesta "+obj.getCosto()+" Dolares y el autor es: "+obj.getAutor().getNombre_Autor()+" escribio loa obra a la edad de: "+obj.getAutor().getEdad()+" Y ha escrito "+obj.getAutor().getLibros_escritos()+" Libros");
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        
    }
     public Libro LibroAntiguo(List<Libro> lista) {
        Libro publicacion_temprana = lista.get(0);
        for (Libro obj : lista) {
            if (publicacion_temprana.getAño_publicado() > obj.getAño_publicado()) {
                publicacion_temprana = obj;
            }

        }
        return publicacion_temprana;
    }
    public Libro Publicado_tarde(List<Libro> lista) {
        Libro publicacion_tardia = lista.get(0);
        for (Libro obj : lista) {
            if (publicacion_tardia.getAño_publicado() < obj.getAño_publicado()) {
                publicacion_tardia = obj;
            }

        }
        return publicacion_tardia;
    }
    public Libro Mas_paginas(List<Libro> lista) {
        Libro maspaginas = lista.get(0);
        for (Libro obj : lista) {
            if (maspaginas.getNum_Pag() < obj.getNum_Pag()) {
                maspaginas = obj;
            }

        }
        return maspaginas;
    }
    public Libro Menos_paginas(List<Libro> lista) {
        Libro menospaginas = lista.get(0);
        for (Libro obj : lista) {
            if (menospaginas.getNum_Pag() > obj.getNum_Pag()) {
                menospaginas = obj;
            }

        }
        return menospaginas;
    }
      public Libro Actualizado_o_no(List<Libro> lista) {
        Libro actualozadoono = lista.get(0);
        for (Libro obj : lista) {
            if (actualozadoono.getNum_Pag() >= 2014) {
                actualozadoono = obj;
                System.out.println("actualizado "+obj.getNombre());
            }else{
                System.out.println("desactualizado "+obj.getNombre());
            }

        }
        return actualozadoono;
    }
    public static void main(String[] args) {
        Libro objeto=new Libro();
        Libro obj1=new Libro("100 AÑOS DE SOLEDAD", new Autor("Gabriel Garcia Marquez", 30, 200), 471, 1,16.62,1967);
        Libro obj2=new Libro("DON QUIJOTE DE LA MANCHA", new Autor("Miguel de Cervantes", 50, 125), 688, 1, 65, 1605);
        Libro obj3=new Libro("EN BUSCA DEL TIEMPO PERDIDO", new Autor("Marcel Proust", 35, 80), 4215, 7, 9.55, 1913);
        Libro obj4 =new Libro("EL HOMBRE INVISIBLE", new Autor("Ralph Ellison", 32, 20), 581, 2, 18.95, 1952);
        List<Libro> lista = new ArrayList<>();
        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj3);
        lista.add(obj4);
//        System.out.println(lista.size());
//        int c = lista.size();
//        System.out.println(c);
//        for (Libro obj : lista) {
//            System.out.println(obj.getNombre()+" y fue publicado en el año: "+obj.getAño_publicado());
//        }
        objeto.escribirLista("C:\\Users\\ITS LOJA\\Desktop\\libro.txt", lista);
//        objeto.leerArchivo("C:\\Users\\ITS LOJA\\Desktop\\libro.txt");
//        
//        objeto.LeerLista("C:\\Users\\ITS LOJA\\Desktop\\libro.txt");
//       objeto.escribirObjeto("C:\\Users\\ITS LOJA\\Desktop\\libro.txt", obj4);
        List<Libro> b = objeto.LeerLibros("C:\\Users\\ITS LOJA\\Desktop\\libro.txt");
//        for (Libro obj : b) {
//            System.out.println(obj.getNombre() + " y tiene "+obj.getNum_Pag()+" paginas");
//        }
        System.out.println("el año del libro que se publico mas pronto es: "+objeto.LibroAntiguo(lista).getAño_publicado()+" y fue el libro "+objeto.LibroAntiguo(lista).getNombre());
        System.out.println("el año del libro que se publico mas tarde es: "+objeto.Publicado_tarde(lista).getAño_publicado()+" y fue el libro "+objeto.Publicado_tarde(lista).getNombre());
        System.out.println("el mayor numero de paginas es: "+objeto.Mas_paginas(lista).getNum_Pag()+" y es del libro de: "+objeto.Mas_paginas(lista).getNombre());
        System.out.println("el menor numero de paginas es: "+objeto.Menos_paginas(lista).getNum_Pag()+" y es del libro de: "+objeto.Menos_paginas(lista).getNombre());
        objeto.Actualizado_o_no(lista);
    }
}
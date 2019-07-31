/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_26_de_julio.ejercicio8;

/**
 *
 * @author ITS LOJA
 */
public class No_Perecedero extends Producto {
   private String Tipo;

 public No_Perecedero(String Tipo,String Nombre,double Precio){
     super(Nombre,Precio);
     this.Tipo=Nombre;
     
 }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
   @Override
 public String MostrarDatos(){
      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" TIPO: "+this.Tipo);
  }  
 
}

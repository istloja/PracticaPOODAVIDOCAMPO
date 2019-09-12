/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author ITS LOJA
 */
public class Conexion_Basica {
    public void Leer(String Usuario,String Clave){
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", Usuario,Clave);
            System.out.println(""+conexion.getCatalog());
            Statement variable=conexion.createStatement();
            ResultSet resultado=variable.executeQuery("select * from persona");
        while(resultado.next()){
            System.out.println(resultado.getString("nombre")+" "+resultado.getString("apellido"));
        }
        } catch (Exception e) {
            System.out.println("se produjo un error en "+e);
        }
        
    }
    public static void main(String[] args) {
 Conexion_Basica objeto= new Conexion_Basica();
objeto.Leer("david", "123456");
    }
}

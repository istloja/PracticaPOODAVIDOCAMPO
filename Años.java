/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Años {

    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //para pasar una fecha a entero
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la fecha en el formato dd/MM/yyyy");
        String fecha = entrada.nextLine();
        Date fechanacimiento = null;
        try {
            fechanacimiento = formato.parse(fecha);//pasando del string a fecha
            System.out.println(fechanacimiento);
            System.out.println(fechanacimiento.before(fechaActual));
        } catch (Exception e) {
            System.out.println("existe un error en " + e);
        }
        GregorianCalendar calendario = new GregorianCalendar();//nos va apermitir manejar fechas
        calendario.setTime(fechaActual);
        int anyoActual = calendario.get(GregorianCalendar.YEAR);
        int mesActual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diaActual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        GregorianCalendar calendario1=new GregorianCalendar();
        calendario1.setTime(fechanacimiento);
        int anyoNac=calendario1.get(GregorianCalendar.YEAR);
        int mesNac = calendario1.get(GregorianCalendar.MONTH) + 1;
        int diaNac = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        int meses;
        int año;
        int dia;
        año=(anyoActual-anyoNac);
        if(mesNac>mesActual){
            meses=(mesNac-mesActual);
        }else{
        meses=mesActual-mesNac;
                }
        if(diaNac>diaActual){
            dia=diaNac-diaActual;
        }else{
        dia=diaActual-diaNac;}
        System.out.println("usted tiene "+ año+" años "+meses+" meses y "+dia+" dias");
        
        
    }
}

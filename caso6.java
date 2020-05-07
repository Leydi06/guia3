/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author leydi
 */
public class caso6 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        String continuar = "S", nombre = "", estado = "";
        int edad = 0, c = 0, c_aptos = 0;
        
        
        while (continuar.contentEquals("S")|| continuar.equals("s")){
           c ++;
           System.out.println("Registro N " + c);
           System.out.println("----------------");
           System.out.print("Paricipante: ");
           nombre = sc.nextLine();
           
           System.out.print("Edad: ");
           edad = sc.nextInt();
           
           if (edad>=18){
               estado = "Aptos para votar";
               c_aptos = c_aptos + 1;
           }
           else 
               estado = "Menor de edad";
           
           System.out.println("Estado: " + estado);
           sc.nextLine();
           
           System.out.print("¿Desea continuar <S/N>?: " );
           continuar = sc.nextLine();
           
           System.out.println("------------------");
        }
        System.out.println("Resumen");
        System.out.println("--------------------");
        System.out.println("Participantes registrados: " + c);
        System.out.println("Cantidad de participantes aptos para votar:" + c_aptos);
        
    }       
}

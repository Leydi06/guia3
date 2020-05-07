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
public class clase10_java {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese nombre del empleado: ");
           String nombre = sc.nextLine();
         System.out.print("Horas trabajadas: ");
          int  horas = sc.nextInt();
         System.out.print("Tarifas por hora: ");
          int tarifa = sc.nextInt();
          System.out.print("minutos: ");
          int minutos = sc.nextInt();
         
          int n1 = horas * tarifa;
          float n2 = (float)(n1 * (0.04));
          float n3 = (float)(n1 *(0.130));
          float n4 = (float)(n1 * (0.03));
          float n5 = (float)(n1 * minutos);
          
       if ( horas<= 54  & tarifa<= 15 & minutos<=15){
           System.out.println("-----------------");
           System.out.println("RESULTADOS");
           System.out.println("-----------------");
           System.out.println("Trabajador: "+ nombre);
           System.out.println("Horas trabajadas: "+ horas);
           System.out.println("Tarifa por hora: "+ tarifa);
           System.out.println("Importe: "+ n1);
           System.out.println("Bono: "+ n2 );
           System.out.println("Descuento: "+ n5);
       }
       else{
           System.out.println("-----------------");
           System.out.println("RESULTADOS");
           System.out.println("-----------------");
           System.out.println("Trabajador: "+ nombre);
           System.out.println("Horas trabajadas: "+ horas);
           System.out.println("Tarifa por hora: "+ tarifa);
           System.out.println("Importe: "+ n1);
           System.out.println("Bono: "+ n3 );
           System.out.println("Descuento: "+ n4);
       }
     
       
           
             
         
        
          
                  
     }
}

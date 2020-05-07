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
public class caso9 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
     
        String continuar = "S", nombre = "", estado = "";
        int n1 = 0,n2 = 0, n3 = 0, c = 0, aptos = 0,asist = 0;
        int promedio ;
        int a_estados = 0 ;
        
        while (continuar.contentEquals("S")|| continuar.equals("s")){
           c ++;
           
           promedio = (n1 + n2 + n3) /3;
           
           System.out.println("Registro N " + c);
           System.out.println("----------------");
           System.out.print("Participante: ");
           nombre = sc.nextLine();
           
           System.out.print("Nota 1: ");
           n1 = sc.nextInt();
           
           System.out.print("Nota 2: ");
           n2 = sc.nextInt();
           
           System.out.print("Nota 3: ");
           n3 = sc.nextInt();
           
           System.out.print("Asistencia[1-12]: ");
           asist = sc.nextInt();
           if ((n1+n2+n3)/3 >=13){
               estado = "Obtiene Certificado";
               aptos = aptos + 1;
           }
           else 
               estado = "Sin certificado";
               a_estados = a_estados + 1; 
              
          System.out.println("------------------");
          System.out.println("Resultados");
          System.out.println("------------------");
          System.out.println("Promedio: " +(n1+n2+n3)/3);
          System.out.println("Asistencia: " + asist * 8.3333);
          System.out.println("Estado: "+estado);
          
          System.out.println("------------------");
          System.out.print("¿Desea continuar <S/N>?: " );
          continuar = sc.nextLine();
           
          System.out.println("------------------");
         }
        
        
}
}
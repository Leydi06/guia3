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
public class caso10 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        String continuar = "S", nombre = "";
        int horas = 0,tarifas = 0, minutos = 0, c = 0, bono = 0;
        float n1 = 0, descuentos = 0;
        
        while (continuar.contentEquals("S")|| continuar.equals("s")){
           c ++;
           
           System.out.println("Registro N " + c);
           System.out.println("----------------");
           System.out.print("Empleado: ");
           nombre = sc.nextLine();
           
           System.out.print("Horas Trabajadas: ");
           horas = sc.nextInt();
           
           System.out.print("Tarifa por Hora: ");
           tarifas = sc.nextInt();
           
           System.out.print("Minutos de tardanza: ");
           minutos = sc.nextInt();
           
           if (horas <= 50){
               
               bono = 0;
           }
           else
               if (horas <= 60){
                    bono = (int) (((float) (horas *tarifas) * 0.02)); 
               }
               else
                   if (horas <=70){
                       bono = (int) (((float) (horas *tarifas) *0.08));
                   }
                   else
                       if (horas <= 80){
                            bono = (int) (((float) (horas *tarifas) *0.13));
                          }
                        else
                            bono = (int) (((float) (horas *tarifas) *0.15));
            
           if (minutos <=15){
               descuentos = 0;  
           }
           else
               if (minutos <=30){
                   descuentos = (float) ((((n1)/100) *0.3)* minutos);
               }
               else
                    descuentos = (float) ((((n1)/100) *0.5)* minutos);
               
           System.out.println("---------------------");
           System.out.println("--- RESULTADOS -----");
           System.out.println("---------------------");
           System.out.println("Sueldo bruto: "+(horas * tarifas));
           System.out.println("Bonificacion: "+ bono );
           System.out.println("Descuento: "+descuentos);
           System.out.println("Sueldo Neto: "+(((horas * tarifas) + bono) - descuentos));
           System.out.println("% Alcanzado: "+(1.25 * horas)); 
           
         
           
           System.out.println("¿Desea continuar <S/N>?:  " );
           continuar = sc.nextLine();
           }
        System.out.println("------------------");
        System.out.println("Resumen");
        System.out.println("--------------------");
        System.out.println("Participantes registrados: " + c);    
           
           
        }
    }
    


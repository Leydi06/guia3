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
public class caso5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Contador: ");
        int n = sc.nextInt();
        int c [] =new int [n];
        int menor ;
        menor = c [0];
        for (int i = 0 ; i <  c.length;i++){
            System.out.print("Ingrese dato "+(i +1)+": ");
            c[i] = sc.nextInt();
        }
        for (int i = 0 ; i >  c.length;i++){
            if (c[i]< menor){
                menor = c[i];
            }
           }
        System.out.println("El numero menor es : "+ menor);
        
        }      
}

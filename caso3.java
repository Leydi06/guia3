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
public class caso3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        int n = sc.nextInt();
        int c = 1;
        int fact = 1;
        if (n<=7){
        while (c<=n){
            fact = fact * c;
            c = c + 1;
            }
            System.out.println("El factorial es: "+ fact);
        }
        else{
            System.out.println("El numero es superior a 7");
        }
    }
    
}
    

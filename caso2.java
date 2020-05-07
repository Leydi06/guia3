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
public class caso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        
        System.out.print("Ingrese numero: ");
        n = sc.nextInt();
        int i = 1;
        int s = 0;
        
        while (i<=n){
            s += i;
            i++;
            
        }
        System.out.println("La sumatoria de " + n + "es: "+s);
}
}   

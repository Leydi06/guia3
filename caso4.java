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
public class caso4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int i = 1;
        int mayor = 0;
        while (i<=4){
            System.out.print("Ingrese numero " + i + ": ");
            n = sc.nextInt();
            
            if (n > mayor)
                mayor = n;
            
            i++;
           }
        System.out.println("El numero mayor es : "+mayor);
    }
    
    
}

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
public class caso7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        String nombre = "";
        
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        for (int i = 1; i<=10;i++)
            System.out.println(i + ".Bienvenido  "  + nombre + " al curso.");
    
}
}
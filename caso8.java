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
public class caso8 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        int num = sc. nextInt();
        for (int i = 1 ; i<=15; i++ )
            System.out.println( num + " x " + i+ "=" +(num*i));
    }   
}

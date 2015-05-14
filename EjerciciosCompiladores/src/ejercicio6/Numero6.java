/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 * Ejercicio numero 6: Imprime numeros neutrales hasta un numero 
 * indicado por el usuario
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero6 {
    
     public static void main(String[] args) {
        int x=0;
        Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un numero:");
        x=scan.nextInt();
        for(int i=0;i<=x;i++) 
            {
            System.out.println(i);
            }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 * Ejercicio numero 11: Imprime multiples de 3 hasta un numero 
 * determinado por usuario
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero11 {
      public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese el numero de tope");
        x=scan.nextInt();
        
        for (int i=1;i<=x+1; i++)
            {
            if(i%3==0)
               {
                System.out.println("El "+i+" es multiplo de 3");
               }
            }
    }
}

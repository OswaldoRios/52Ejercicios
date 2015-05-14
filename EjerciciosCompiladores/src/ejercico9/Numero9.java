/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico9;

import java.util.Scanner;

/**
 * Ejercicio numero 9: Indica si un numero es positivo o negativo
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero9 {
     public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        if (x>0) 
            System.out.println("El numero es positivo");
        else
            System.out.println("El numero es negativo");
        
    }
}

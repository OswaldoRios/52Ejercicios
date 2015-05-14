/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 * Ejercicio numero 10: Indica si un numero es par o impar
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero10 {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        x= scan.nextInt();
        if(x%2==0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
    }
}

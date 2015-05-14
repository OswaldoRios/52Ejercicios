/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 * Ejercicio numero 7: Introduce frases y las cuenta
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero7 {
    
       public static void main(String[] args) {
        String ask;
        int cont = 0;
        System.out.println("Introduce una frase. Para terninar introduce un *");
        Scanner scan = new Scanner(System.in);
        do {
            ask = scan.nextLine();
            cont++;
            } while (!"*".equals(ask));
        cont = cont - 1;
        System.out.println("Introuduciste " + cont + " Frases");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 * Ejercicio numero 18: Cuenta las veces que se ingreso una latra en una frase 
 * detarminada
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero18 {
    
    public static void main(String[] args) {
        String text;
        char[] text2;
        char letra;
        int cont=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Introducir frase");
        text = scan.nextLine();
        text2= text.toCharArray();
        System.out.println("Introducir letra que quiere buscar");
        letra= scan.nextLine().charAt(0);
        for (int i = 0; i<text2.length; i++) {
            if(text2[i]==letra)
            {
                cont++;
            }
        }
        System.out.println("La letra aparecio "+cont+" veces");
    }
}

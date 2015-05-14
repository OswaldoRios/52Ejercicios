/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 * Ejercicio numero 17: Imprime cuenta y suma numeros pares entre dos numeros
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero17 {
    public static void main(String[] args) {
        int aux, cont1 = 0, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer numero");
        int x= scan.nextInt();
        System.out.println("Segundo numero");
        int y= scan.nextInt();
        if (y<x) {
            aux=y;
            y=x;
            x=aux;
        }
        for (int i=y;i>=x;i--) {
            if (i % 2 == 0) {
                System.out.println("\n"+i);
                cont1++;
                sum= sum+i;
            }
        }
        System.out.println("Numeros pares " + cont1);
        System.out.println("Suma " + sum);
    }
}

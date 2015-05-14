/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 * Ejercicio numero 13: Indica los multiples del 1 al 100 
 * que se dividen entre 2 y 3
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero13 {
    public static void main(String[] args) {
        int cont=0,cont2=0;
        for (int i=0;i<=100;i++) {
            if (i%2==0) 
                {
                System.out.println("El "+i+" es multiplo de 2");
                cont++;
                }
            else if(i%3==0)
                {
                System.out.println("El "+i+" es multiplo de 3");
                cont2++;
                }
        }
        System.out.println("Total de multiplos de 2 "+ cont);
        System.out.println("Total de multiplos de 3 "+ cont2);
    }
}

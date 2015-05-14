/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 * Ejercicio numero 21: Calcula suma de pares e impares mediante switch
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero21 {
    
    
     public static void main(String[] args) {
        int x,suma=0, suma2=0;
        
        for (int i = 0; i <= 1000; i++) {
            x=i%2;
            switch (x) {
                case 0:
                    suma=suma+i;
                    break;
                default:
                    suma2=suma2+i;
            }
        }
        System.out.println("Suma de pares: "+suma);
        System.out.println("Suma de impares: "+suma2);
    }
}

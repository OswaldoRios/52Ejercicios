/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 * Ejercicio numero 12: Calcula suma de numeros pares e impares del 1 al 100por separado
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero12 {
     public static void main(String[] args) {
        int sumPar=0, sumImp=0;
        for (int i=1;i<=100;i++) {
            if(i%2==0)
                sumPar=sumPar+i;
            else
                sumImp= sumImp+i;
        }
        System.out.println("La suma de pares es"+sumPar);
        System.out.println("La suma de impares es"+sumImp);
    }
}

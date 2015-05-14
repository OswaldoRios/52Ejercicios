/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 * Ejercicio numero 5: Imprime numeros impares del 1 al 100 e indica cuantos son
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */

public class Numero5 {
    
     public static void main(String[] args) {
        int x=0;
        for (int i=0; i<=100;i++) 
            {
             if (i%2!=0) 
                {
                System.out.println(i);
                x++;
                }
        }
        System.out.println("Son "+x+" impares");
    }
    
}

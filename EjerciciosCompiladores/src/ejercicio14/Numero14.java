/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 * Ejercicio numero 14: Imprime el numero mayor y menor entre 5 numeros
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero14 {
    
     public static void main(String[] args) {
        int[] array = new int[5];
        int temp=0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            System.out.println("Introduce un numero "+(i+1));
            array[i]=scan.nextInt();
        }
        for (int i=0; i<array.length; i++) 
            {
            for (int j=0; j<array.length-1;j++)
                 {
                  if(array[j]<array[j+1])
                    {
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    }
            }
            }
        System.out.println("El numero mayor es "+array[0]);
        System.out.println("El numero menor es "+array[4]);
    }
    
    
    
    
}

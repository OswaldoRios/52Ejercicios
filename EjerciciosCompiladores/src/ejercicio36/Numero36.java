/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36;

import java.util.Random;

/**
 * Ejercicio numero 36: Genera matriz de numeros aleatorios del 1 al 100
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero36 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int array[][]= new int[4][5];
         for(int i=0;i<4;i++)
         {
           System.out.print("\n"); 
       
           for(int j=0;j<5;j++)
               {
                 array[i][j]=(int) random.nextInt(100);
                 System.out.print(array[i][j]+" ");
                }
         }
         

    }
    
}

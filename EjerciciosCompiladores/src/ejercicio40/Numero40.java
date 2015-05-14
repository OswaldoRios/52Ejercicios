/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio40;

/**
 * Ejercicio numero 40: Crea una tabla ordenada de numeros del 1 al 20 en matriz de 5x4
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero40 {
      public static void main(String[] args) {
        int array[][]= new int[5][4];
        int cont=1;
        for(int i=0;i<3;i++)
           {
             for(i=0;i<5;i++)
                {
                 System.out.print("\n ");
                 for(int j=0;j<4;j++)
                     {
                      array[i][j]=cont;
                      System.out.print(array[i][j]+ " ");
                      cont=cont+1;
                     }
               }
            }
    }
}

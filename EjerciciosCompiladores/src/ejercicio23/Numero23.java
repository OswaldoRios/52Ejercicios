/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author ozzIE
 */
public class Numero23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Ingrese el tamano del columnas y filas de la matriz \n"
                + "recuerde que no debe de exceder una area de 101 \n");
        System.out.print("Tamano de columnas (no ingrese zero ni negativos):");
        int x= scan.nextInt();
        System.out.print("Tamano de filas (no ingrese zero ni negativos):");
        int y= scan.nextInt();
        int[][] array = new int[x][y];
       
       while(x*y>101||x<=0||y<=0)
        {
        System.out.print("Recuerde que el area de la matriz no debe exceder 101\n");
        System.out.print("\nIngrese el tamano de columnas(no ingrese zero ni negativos):");
        x= scan.nextInt();
        System.out.print("Ingrese el tamano de filas(no ingrese zero ni negativos):");
        y= scan.nextInt();
        }
         int n = x*y;
         int k=0;
         for(int i=0;i<x;i++)
         {
          System.out.print("\n ");
         for(int j=0;j<y;j++)
         {
          if(k<=n)
          {array[i][j]=k;
          k++;
        System.out.print("("+array[i][j]+")");
          }
         }
         }
         
         
         
    }
    
}

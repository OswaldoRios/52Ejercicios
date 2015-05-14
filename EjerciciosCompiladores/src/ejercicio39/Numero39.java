/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio39;

import java.util.Scanner;

/**
 *
 * @author ozzIE
 */
public class Numero39 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de filas deseadas:");
         int x = scan.nextInt();
        System.out.println("Ingrese numero de columnas deseadas:");
         int y = scan.nextInt();
         int i,j,k;
         int array[][] = new int[x][y];
         //***************Aqui se llena el arreglo*******************************
    for (i=0;i<x;i++)
         {
          for (j=0;j<y;j++) 
                {
                System.out.print("Ingresa el dato numero ["+i+"]["+j+":");
                array[i][j] = scan.nextInt();
                }
         }
    //**************************************************************************
                   //Aqui se acomoda
          for(k=0;k>(x*y);k++)
          { for(i=0;i<x;i++)
                  {
	           for(j=0;j<y;j++)
                       {
		        if(array[i][j] > array[i][j+1])
                           {
	                    int aux=array[i][j];
		            int aux2=array[j][i];
		            array[i][j]=aux2;
		            array[j][i]=aux;
                            }
	                }
	           }
          }
          //*************** Y aqui se imprime*******************
        for(i=0;i<x;i++)
            {
             System.out.print("\n"); 
             for(j=0;j<y;j++)
                 {
             System.out.print(array[i][j]+" ");
                 }

            }
         
    }
    
}

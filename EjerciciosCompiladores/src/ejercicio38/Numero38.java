/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio38;

import java.util.Scanner;

/**
 * Ejercicio numero 38: Guarda notas y cursos de alumnos en un arreglo bidimensional
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero38 {
    
     public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.println("Cuantos cursos desea ingresar?");
        y=scan.nextInt();
        System.out.println("Cuantos alumnos hay en ese curso?");
        x=scan.nextInt();
        int array[][]= new int[y][x];
          for(int i=0;i<y;i++)
           {
            for(int j=0;j<x;j++)
            {
              System.out.println("Calificacion de estudiante numero "+(j+1)+":");
              array[i][j]=scan.nextInt();
           }
        }
        for(int i=0;i<y;i++)
            {
            System.out.print("\n"); 
            for(int j = 0; j < x; j++)
                {
                System.out.print(array[i][j]+" ");
                }
            }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Scanner;

/**
 * Ejercicio numero 32: Comprueba si un numero es primo, halla su factorial e imprime su tabla de multiplicar.
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int x= scan.nextInt();
        System.out.println("\nIngrese 1 para revisar si el numero es primo");
        System.out.println("Ingrese 2 para hallar su factorial");
        System.out.println("Ingrese 3 Imprimir tabla de multiplicaciones");
        int z= scan.nextInt();
        switch(z)
        {
             case 1: 
                 int flag=0;
                 for(int i=2;i<x;i++)
                     {
                      if(x%i==0)
                        {
                         flag=1;
                        }
                     }
                     if(flag==1)
                       System.out.println("Ese numero no es primo");
                     else
                        System.out.println("Ese numero si es primo");
                    break;
             case 2: 
                        int aux=x;           
                    for(int i=x;i>1;i--)     
                    {
                       int y= (aux*(i-1));   
                       aux=y;    
                    }
                    System.out.println("El numero factorial es: "+aux);
                    break;            
             case 3: 
                    for(int i=0;i<11;i++)
                        {
                         int y=i*x;
                         System.out.println(x+"x"+i+"="+y+"\n");
                        }
                    break;        
              
        }
        
        
        
        
        
        
        
        
        
        
        
          
        
        
        
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author ozzIE
 */
public class Numero24 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero a revisar si es primo(Mayor que cero):");
        int x=scan.nextInt();
        while(x<=0)
        {System.out.println("Ingrese otro numero, recuerde que debe ser mayor que zero:");
        x=scan.nextInt();
        }
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
        
        }
    
}

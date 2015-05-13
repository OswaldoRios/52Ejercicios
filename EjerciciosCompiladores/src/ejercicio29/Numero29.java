/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio numero 29: Simula 100 tiradas de dos dados e indica cuando los dos dados suman 10
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero29 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 'Y' si desea simular los dados o cualquier otra tecla para salir");
        String option= scan.nextLine();
        while(option.equals("Y")||option.equals("y") )
        {
            System.out.println("Lanzando 2 dados 100 veces...");
            for(int i=1;i<101;i++)
            {
            int x=random.nextInt(12);
            int y=random.nextInt(12);
            if(x+y==10)
            {
            System.out.println("Los dos dados sumaron 10 en la tirada numero "+i);
            System.out.println("Primer dado salio "+x+" y el segundo salio "+y);
            }
            }
            System.out.println("Ingrese 'Y' si desea simular de nuevo o cualquier otra tecla para salir");
            option= scan.nextLine();
        }
        
        
        
        
    }
    
    
}

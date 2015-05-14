/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 * Ejercicio numero 19: Simula un reloj digital
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero19 {
    
      public static void main(String[] args) throws InterruptedException {
        int hr;
        int min;
        int seg;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce la hora (sin minutos) ");
        hr = scan.nextInt();
        System.out.println("Ahora si introduce los minutos: ");
        min = scan.nextInt();
        System.out.println("Cuantos segundos?: ");
        seg = scan.nextInt();
        while(true){
            for (int i=hr; i<=23;i++) 
                 {
                   for (int j=min; j<=59;j++)
                       {  
                         for (int k=seg; k<=59;k++)
                         {
                         
                         if (i < 10 && j< 10) 
                        System.out.println("Son las: 0" + i + ":0" + j + " hrs con "+k+" segundos");
                        else if (j < 10) 
                        System.out.println("Son las: " + i + ":0"+ j + " hrs con "+k+" segundos");
                        else if (i < 10) 
                        System.out.println("Son las: 0" + i + ":" + j + " hrs con "+k+" segundos");
                        else
                        { System.out.println("Son las: " + i + ":" + j + " hrs con "+k+" segundos");}
                         Thread.sleep(1000);
                       }
                         seg=0;
                   }
                       min=0;
            }
            hr = 0;
        }

    }
}

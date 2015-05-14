/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 * Ejercicio numero 8: Solo permite S o N
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero8 {
     public static void main(String[] args) {
        int flag=0;
        Scanner scan = new Scanner(System.in);
         System.out.println("Ingresa N o Y para poder salir");
        while(flag==0)
             {
                String test= scan.next();
                if ("S".equals(test) || "N".equals(test))
                   {
                    System.out.println("Si acepto ese caracter, puedes salir");
                    flag=1;
                    } else
                    {
                     System.out.println("Ese caracter no es valido intenta de nuevo");
                     flag=0;
                    }
        } 

    }
}

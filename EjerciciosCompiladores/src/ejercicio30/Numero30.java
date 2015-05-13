/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio numero 30: Simula una carrera de dos caballos
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero30 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese 'Y' si desea jugar carreras o cualquier otra tecla para salir");
        String option= scan.nextLine();
        String winner;
        while(option.equals("Y")||option.equals("y") )
        {
            int x=random.nextInt();
            if(x%2==0)
            winner="caballo negro!";
            else
            {winner="caballo blanco!";}
            System.out.println("En sus marcas...listos...fuera!\n...\n...\n...");
            System.out.println("El ganador de esta carrera es el "+winner);
            System.out.println("Ingrese 'Y' si desea correr de nuevo o cualquier otra tecla para salir");
            option= scan.nextLine();
        }
    
    
    } 
}

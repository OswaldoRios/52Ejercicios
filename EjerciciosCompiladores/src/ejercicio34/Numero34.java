/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34;

import java.util.Scanner;

/**
 * Ejercicio numero 34: Ingresa calificaciones y devuelve un promedio
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero34 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] courses = {"Compiladores", "Bases de datos", "Pruebas de software",
            "Sistemas Operativos", "Verificacion y Validacion", "Ingles", 
            "Redes", "Calculo", "Educacion Fisica","Espanol"};
        float score = 0;
        float calificacion[] = new float[10];
        for (int i=0;i<courses.length; i++)
            {
            System.out.println("Ingrese una nota para "+ courses[i]+" :");
            calificacion[i] = scan.nextFloat();
            score= score+calificacion[i];
            }
         System.out.println("\nSu promedio es: " + score/10);
    }

    
}

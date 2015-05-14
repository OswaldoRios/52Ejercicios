/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 * Ejercicio numero 35: Busca una nota en un arreglo e indica si se encontro o no
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero35 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x;
        int y=0;
        String[] courses = {"Compiladores", "Bases de datos", "Pruebas de software",
            "Sistemas Operativos", "Verificacion y Validacion", "Ingles", 
            "Redes", "Calculo", "Educacion Fisica","Espanol"};
        float calificaciones[] = new float[10];
        for (int i=0;i<courses.length; i++)
            {
            System.out.println("Ingrese una nota para "+ courses[i]+" :");
            calificaciones[i] = scan.nextFloat();
            }
        System.out.println("\n Ok, cual calificacion deseas buscar?");
             x= scan.nextFloat();
        System.out.println("Encontre es calificacion en...");
        for (int i=0;i<courses.length;i++) 
            {
             if(calificaciones[i]==x)
               {
                  y++;
                 System.out.println(courses[i]);
               }
           }
        if(y>1)
            System.out.println("De echo se ingreso "+y+" veces");
        if(y==0)
            System.out.println("Hmm...espera, esa calificacion no fue ingresada");
    }      
    
}

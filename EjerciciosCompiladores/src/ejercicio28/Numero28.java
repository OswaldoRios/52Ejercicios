/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio numero 28: Indica si una moneda callo en aguila o sello
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese 'Y' si desea voltear la moneda o cualquier otra tecla para salir");
        String option= scan.nextLine();
        String moneda;
        while(option.equals("Y")||option.equals("y") )
        {
            int x=random.nextInt();
            if(x%2==0)
            moneda="Aguila";
            else
            {moneda="Sello";}
            System.out.println("La moneda callo en: "+moneda);
            System.out.println("Ingrese 'Y' si desea voltear la moneda o cualquier otra tecla para salir");
            option= scan.nextLine();
        }
        
        
        
        
        
        
    }
    
    
}

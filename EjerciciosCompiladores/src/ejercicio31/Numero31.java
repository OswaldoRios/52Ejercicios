/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31;

import java.util.Scanner;

/**
 * Ejercicio numero 31: Calcula Division, Suma, Resta, y Multiplicacion entre dos numeros
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int x= scan.nextInt();
        System.out.println("Ingrese otro numero");
        int y= scan.nextInt();
        System.out.println("Ingrese 1 para sumarlos");
        System.out.println("Ingrese 2 para restarlos");
        System.out.println("Ingrese 3 para multiplicarlos");
        System.out.println("Ingrese 4 para dividirlos\n");
        int z= scan.nextInt();
        switch(z)
        {
             case 1: System.out.println(x+"+"+y+"="+(x+y));
                    break;
             case 2: System.out.println(x+"-"+y+"="+(x-y));
                    break;            
             case 3: System.out.println(x+"x"+y+"="+(x*y));
                    break;        
             case 4: 
                    if(y==0)
                    System.out.println("No se puede dividir por cero!");
                    else
                    System.out.println(x+"/"+y+"="+(x/y));
                    break;    
        }
             
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}

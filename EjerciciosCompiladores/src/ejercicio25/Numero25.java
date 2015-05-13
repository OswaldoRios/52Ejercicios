/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;

/**
 * Ejercicio numero 25: Convierte numeros del 1 al 5000 a numeros Romanos
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero25 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, i;
        int MDecimal[] = {5000, 4000, 1000, 900, 500, 400,100, 90, 50, 40,10, 9, 5, 4, 1};
        String MRomano[] = {"V", "MV", "M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};

        System.out.println("\nIntroduzca un numero: ");
         x = scan.nextInt();

        if (x<=5000) 
           {
            i = 0;
            System.out.println("\nNumero Romano: ");
             while (x > 0) 
                {
                 if (x >= MDecimal[i])
                    { 
                      System.out.print(MRomano[i]);
                      x = x - MDecimal[i]; 
                    } 
                 else 
                       i++; 
                }
        System.out.println(" ");
            }
        else
             System.out.println("El numero no puede ser procesado");
            
    }
    
}

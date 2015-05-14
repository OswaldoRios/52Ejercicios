/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 * Ejercicio numero 20: Calcula factorial de un numero mediante subprograma
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero20 {
    
    public static void main(String[] args) {
        int x;
        Numero20 num = new Numero20();
        Scanner esc = new Scanner(System.in);
        System.out.println("Introducir numero que quiera el factorial");
        x= esc.nextInt();
        System.out.println("El factorial es: "+num.factorial(x));
    }
    
    private int factorial(int a){
        int x=a;
        for (int i = a; i > 2; i--) {
            x=x*(i-1);
        }
        return x;
    }
}

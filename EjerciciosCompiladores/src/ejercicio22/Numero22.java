/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author ozzIE
 */
public class Numero22 {
    
    public static void main(String[] args) {
        String[][] arr = new String[5][4];
        String fras;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir cadena:");
        fras = scan.nextLine();
        for (int i=0; i<5;i++) 
            {
            System.out.println("\n");
            for (int j=0; j<4; j++) 
                 {
                    arr[i][j] = fras;
                     System.out.print(arr[i][j]+"    ");
                 }
             }
      

    }
}

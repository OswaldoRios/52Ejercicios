/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio42;

import java.util.Random;

/**
 * 42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus
 * tres representantes a lo largo de doce meses de sus cuatro productos,
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero42 {
    
      public static void main(String[] args) {
        int[][][] VENTAS = new int[3][12][4];
        int[][] TOTAL = new int[12][4];
        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                for (int k = 0; k < 4; k++) {
                    VENTAS[i][j][k] = rnd.nextInt(20);
                }
            }
        }
        System.out.println("Matriz VENTAS");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRepresentante " + (i + 1));
            System.out.println("----------------");
            for (int j = 0; j < 12; j++) {
                System.out.println("\nMes " + (j + 1));
                System.out.println("+++++++++++++++");
                for (int k = 0; k < 4; k++) {
                    System.out.println("Producto " + (k + 1));
                    System.out.println("Se vendio " + VENTAS[i][j][k] + " Veces");
                    TOTAL[j][k] = VENTAS[i][j][k];
                }

            }
        }

        System.out.println("Matriz TOTAL");
        for (int i = 0; i < 12; i++) {
            System.out.println("\nMes " + (i + 1));
            System.out.println("+++++++++++++++");
            for (int j = 0; j < 4; j++) {
                System.out.println("Producto " + (j + 1));
                System.out.println("Se vendio " + TOTAL[i][j] + " Veces");
            }
        }

    }
}

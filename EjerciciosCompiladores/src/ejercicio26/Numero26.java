/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Ejercicio numero 26: Imprime un mensaje escrito por el usuario a pantalla
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */
public class Numero26 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el mensaje que desea imprimir");
        String text = scan.nextLine();
        JOptionPane.showMessageDialog(null, text);
    }
    
}

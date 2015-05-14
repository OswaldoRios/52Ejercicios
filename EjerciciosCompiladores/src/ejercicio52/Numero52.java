/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 52.-Tenemos el fichero DATOS.DAT con la misma estructura anterior, 
 * que esta indexado por el campo DNI. Crear un programa que nos permita 
 * consultar un registro siempre que queramos.
 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero52 {
     public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int x = 0;
        Scanner escaner = new Scanner(System.in);
        Numero52 eje = new Numero52();

        eje.consulta();

    }

    private void consulta() {

        int salir = 0, x, i = 0;
        String[] datos1 = new String[5];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner esc = new Scanner(System.in);

        try {
            archivo = new File("DATOS.dat");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                datos1[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        System.out.println("Dato que desea consultar indicar linea");
        x = esc.nextInt();

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            for (int y = 0; y < 5; y++) {
                if (y == (x - 1) && datos1[y] != null) {
                    System.out.print(datos1[y]);
                    System.out.println(" ");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

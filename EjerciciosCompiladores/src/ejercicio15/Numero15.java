/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author ozzIE
 */
public class Numero15 {
      public static void main(String[] args) {
        int aux=0, cont=0, cont2=0,sum=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer valor");
        int x=scan.nextInt();
        System.out.println("Segundo valor");
        int y=scan.nextInt();
        
        if(x>y)
            {
            aux=x;
            x=y;
            x=aux;
            }
        for (int i=x;i<=y; i++) 
            {
             if (i>0)
                {
                System.out.println(i);
                cont++;
                 }
              if(i%2==0)
                 {
                cont2++;
                }else
              {
                  sum=sum+i;
                  
              }
        }
        System.out.println("Son "+cont+" numeros naturales");
        System.out.println("Son "+cont2+" numeros pares");
        System.out.println("y la suma de los impares es "+sum);
        }
}

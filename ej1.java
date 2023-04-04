/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2a3;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
     Scanner obj = new Scanner (System.in);
     int n1 ;
     int n2;
     int resultado;
        System.out.println(" ingrese primer numero");
        n1 = obj.nextInt();

        System.out.println(" ingrese segundo numero");
        n2 = obj.nextInt();
        resultado= n1 + n2;
        System.out.println("el resulado es : " + resultado);
        
    }
}
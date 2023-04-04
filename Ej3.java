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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
              Scanner scanner = new Scanner (System.in);
        System.out.println(" Ingrese frase ");
          String frase = scanner.nextLine();
        String frase1= frase.toUpperCase();
        System.out.println(frase1);
        String frase2= frase.toLowerCase();
        System.out.println(frase2);
    }
    
}



   

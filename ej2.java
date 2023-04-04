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
public class ej2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println(" Ingrese nombre ");
        
        String nomb = scanner.nextLine();
    
        System.out.println(" El nombre ingresado es : " + nomb);
    }
    
}
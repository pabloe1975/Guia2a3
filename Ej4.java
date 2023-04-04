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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);
               double F, C;
        System.out.println(" Ingrese grados Celsius");
        C = lector.nextDouble();
        F = 32 + (9*C/5);
        System.out.println(" La conversion a grados Fahrenheit es :"+F);
    }
    
}


package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        float SUMA, X, Y;
        Scanner entrada = new Scanner (System.in);
        
        SUMA = 0;
        System.out.println("Ingrese el valor de X");
        X = entrada.nextFloat();
        SUMA = SUMA + X;
        Y = 40;
        X = X + (Y*Y);
        SUMA = SUMA + (X/Y);
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);       
                
    }
}

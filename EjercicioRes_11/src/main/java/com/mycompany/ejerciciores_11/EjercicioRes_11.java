package com.mycompany.ejerciciores_11;

import java.util.Scanner;

public class EjercicioRes_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número entero:");
            int num1 = sc.nextInt();
            
            System.out.println("Ingrese el segundo número entero:");
            int num2 = sc.nextInt();
            
            System.out.println("Ingrese el tercer número entero:");
            int num3 = sc.nextInt();
            
            int mayor = num1; // Suponemos que el primer número es el mayor inicialmente
            
            if (num2 > mayor) {
                mayor = num2;
            }
            
            if (num3 > mayor) {
                mayor = num3;
            }
            
            System.out.println("El mayor de los tres números es: " + mayor);
        }
    }
}

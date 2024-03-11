package com.mycompany.ejerciciopro_24;

import java.util.Scanner;

public class EjercicioPro_24 {
    public static void main(String[] args) {
        // Ingreso de pesos de las esferas
        try (Scanner scanner = new Scanner(System.in)) {
            // Ingreso de pesos de las esferas
            System.out.println("Ingrese el peso de la esfera A:");
            double pesoA = scanner.nextDouble();
            
            System.out.println("Ingrese el peso de la esfera B:");
            double pesoB = scanner.nextDouble();
            
            System.out.println("Ingrese el peso de la esfera C:");
            double pesoC = scanner.nextDouble();
            
            // Determinar la esfera de mayor peso
            if (pesoA > pesoB && pesoA > pesoC) {
                System.out.println("La esfera de mayor peso es la A.");
            } else if (pesoB > pesoA && pesoB > pesoC) {
                System.out.println("La esfera de mayor peso es la B.");
            } else if (pesoC > pesoA && pesoC > pesoB) {
                System.out.println("La esfera de mayor peso es la C.");
            } else {
                System.out.println("Las esferas tienen el mismo peso.");
            }
        }
    }
}

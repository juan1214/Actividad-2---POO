package com.mycompany.ejerciciopro_23;

import java.util.Scanner;

public class EjercicioPro_23 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el valor de A:");
            double a = scanner.nextDouble();
            
            System.out.println("Ingrese el valor de B:");
            double b = scanner.nextDouble();
            
            System.out.println("Ingrese el valor de C:");
            double c = scanner.nextDouble();
            
            // Calcular el discriminante
            double discriminante = b * b - 4 * a * c;
            
            // Verificar el tipo de soluciones
            if (discriminante > 0) {
                // Dos soluciones reales distintas
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminante == 0) {
                // Dos soluciones reales iguales
                double x = -b / (2 * a);
                System.out.println("La solución doble es: x = " + x);
            } else {
                // Soluciones imaginarias
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("Las soluciones son complejas: ");
                System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
            }
        }
    }
}

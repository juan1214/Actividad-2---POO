package com.mycompany.ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
            double lado = sc.nextDouble();
            
            double perimetro = 3 * lado;
            double altura = (Math.sqrt(3) / 2) * lado;
            double area = (Math.sqrt(3) / 4) * lado * lado;
            
            System.out.println("\nPerímetro del triángulo: " + String.format("%.3f",perimetro));
            System.out.println("Altura del triángulo: " + String.format("%.3f",altura));
            System.out.println("Área del triángulo: " + String.format("%.3f",area));
        }
    }
}

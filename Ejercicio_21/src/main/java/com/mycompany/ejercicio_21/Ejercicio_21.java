package com.mycompany.ejercicio_21;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el lado 1 del triángulo: ");
            double lado1 = sc.nextDouble();
            
            System.out.print("Ingrese el lado 2 del triángulo: ");
            double lado2 = sc.nextDouble();
            
            System.out.print("Ingrese el lado 3 del triángulo: ");
            double lado3 = sc.nextDouble();
            
            double perimetro = lado1 + lado2 + lado3;
            double semiperimetro = perimetro / 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
            
            System.out.println("\nPerímetro del triángulo: " + perimetro);
            System.out.println("Semiperímetro del triángulo: " + semiperimetro);
            System.out.println("Área del triángulo: " + String.format("%.3f", area));
        }
    }
}



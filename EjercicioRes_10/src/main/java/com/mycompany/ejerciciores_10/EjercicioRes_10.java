package com.mycompany.ejerciciores_10;

import java.util.Scanner;

public class EjercicioRes_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el número de inscripción:");
            int numInscripcion = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese los nombres del estudiante:");
            String nombres = sc.nextLine();
            
            System.out.println("Ingrese el patrimonio del estudiante:");
            double patrimonio = sc.nextDouble();
            
            System.out.println("Ingrese el estrato social del estudiante:");
            int estrato = sc.nextInt();
            
            double matricula = 50000; // Valor base de la matrícula
            
            if (patrimonio > 2000000 && estrato > 3) {
                double incremento = patrimonio * 0.03;
                matricula += incremento;
            }
            
            System.out.println("Número de inscripción: " + numInscripcion);
            System.out.println("Nombres: " + nombres);
            System.out.println("Pago de matrícula: $" + matricula);
        }
    }
}

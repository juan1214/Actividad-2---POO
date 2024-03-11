package com.mycompany.ejerciciores_12;

import java.util.Scanner;

public class EjercicioRes_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese los nombres del trabajador:");
            String nombres = sc.nextLine();
            
            System.out.println("Ingrese el número de horas trabajadas en la semana:");
            int horasTrabajadas = sc.nextInt();
            
            System.out.println("Ingrese el valor recibido por una hora normal de trabajo:");
            double valorHoraNormal = sc.nextDouble();
            
            double salario = 0.0;
            
            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * valorHoraNormal;
            } else {
                int horasNormales = 40;
                int horasExtras = horasTrabajadas - 40;
                
                if (horasExtras <= 8) {
                    salario = horasNormales * valorHoraNormal + horasExtras * valorHoraNormal * 2;
                } else {
                    salario = horasNormales * valorHoraNormal + 8 * valorHoraNormal * 2 + (horasExtras - 8) * valorHoraNormal * 3;
                }
            }
            
            System.out.println("El trabajador " + nombres + " recibirá un salario de: $" + salario);
        }
    }
}

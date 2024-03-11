package com.mycompany.ejercicio_18;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el código del empleado: ");
            int codigoEmpleado = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Ingrese los nombres del empleado: ");
            String nombres = sc.nextLine();
            
            
            System.out.print("Ingrese el número de horas trabajadas al mes: ");
            int horasTrabajadas = sc.nextInt();
            
            System.out.print("Ingrese el valor por hora trabajada: ");
            double valorHora = sc.nextDouble();
            
            System.out.print("Ingrese el porcentaje de retención en la fuente: ");
            double retencion = sc.nextDouble();
            
            double salarioBruto = horasTrabajadas * valorHora;
            double salarioNeto = salarioBruto - (salarioBruto * (retencion / 100));
            
            System.out.println("\nCódigo del empleado: " + codigoEmpleado);
            System.out.println("Nombres del empleado: " + nombres);
            System.out.println("Salario bruto: $" + salarioBruto);
            System.out.println("Salario neto: $" + salarioNeto);
        }
    }
}



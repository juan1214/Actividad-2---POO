package com.mycompany.ejerciciores_14;

import java.util.Scanner;

public class EjercicioRes_14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese las ventas del departamento 1:");
            double ventasDept1 = scanner.nextDouble();
            
            System.out.println("Ingrese las ventas del departamento 2:");
            double ventasDept2 = scanner.nextDouble();
            
            System.out.println("Ingrese las ventas del departamento 3:");
            double ventasDept3 = scanner.nextDouble();
            
            System.out.println("Ingrese el salario mensual de los vendedores de cada departamento:");
            double salarioMensual = scanner.nextDouble();
            
            // Calcular la suma total de las ventas
            double totalVentas = ventasDept1 + ventasDept2 + ventasDept3;
            
            // Calcular el 33% de las ventas totales
            double porcentajeVentas = 0.33 * totalVentas;
            
            // Aplicar incentivos a cada departamento según corresponda
            double salarioDept1 = (ventasDept1 > porcentajeVentas) ? salarioMensual * 1.20 : salarioMensual;
            double salarioDept2 = (ventasDept2 > porcentajeVentas) ? salarioMensual * 1.20 : salarioMensual;
            double salarioDept3 = (ventasDept3 > porcentajeVentas) ? salarioMensual * 1.20 : salarioMensual;
            
            // Mostrar los salarios de los vendedores de cada departamento
            System.out.println("Salario vendedores departamento 1: " + salarioDept1);
            System.out.println("Salario vendedores departamento 2: " + salarioDept2);
            System.out.println("Salario vendedores departamento 3: " + salarioDept3);
        }
    }
}



package com.mycompany.ejerciciores_13;

import java.util.Scanner;

public class EjercicioRes_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el color de la bolita (blanca, verde, amarilla, azul, roja):");
            String colorBolita = sc.nextLine();
            
            System.out.println("Ingrese el valor total de la compra:");
            double valorCompra = sc.nextDouble();
            
            
            sc.nextLine();
            
            double descuento = 0.0;
            boolean colorValido = true;
            
            switch (colorBolita) {
                case "blanca" -> descuento = 0.0;
                case "verde" -> descuento = 0.10 * valorCompra;
                case "amarilla" -> descuento = 0.25 * valorCompra;
                case "azul" -> descuento = 0.50 * valorCompra;
                case "roja" -> descuento = 1.00 * valorCompra;
                default -> {
                    System.out.println("Color de bolita no válido.");
                    colorValido = false;
                }
            }
            
            if (colorValido) {
                double totalPagar = valorCompra - descuento;
                System.out.println("El cliente deberá pagar: $" + totalPagar);
            }
        }
    }
}

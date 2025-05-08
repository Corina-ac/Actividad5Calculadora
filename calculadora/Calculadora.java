/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author espe
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los valores
        System.out.print("Ingrese el primer número (operando1): ");
        int operando1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (operando2): ");
        int operando2 = scanner.nextInt();

        // Crear la calculadora con los valores ingresados
        Calculadora1 miCalculadora = new Calculadora1(operando1, operando2);

        // Mostrar resultados
        System.out.println("La suma es: " + miCalculadora.sumar());
        System.out.println("La resta es: " + miCalculadora.restar());
        System.out.println("La multiplicación es: " + miCalculadora.multiplicar());
        System.out.println("La división es: " + miCalculadora.dividir());

        scanner.close();
    }
}

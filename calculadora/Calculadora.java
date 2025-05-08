/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora1 calc = new Calculadora1();
        double n1, n2;
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA EN JAVA ===");
            System.out.println("1: SUMAR");
            System.out.println("2: RESTAR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("5: POTENCIA");
            System.out.println("6: RAÍZ CUADRADA");
            System.out.println("7: SALIR");
            System.out.print("INGRESE UNA OPCIÓN: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.sumar(n1, n2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.restar(n1, n2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.dividir(n1, n2));
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    n2 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.potencia(n1, n2));
                    break;
                case 6:
                    System.out.print("Ingrese el número: ");
                    n1 = scanner.nextDouble();
                    System.out.println("RESULTADO: " + calc.raizCuadrada(n1));
                    break;
                case 7:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
                    break;
            }
        } while (opcion != 7);
    }
}



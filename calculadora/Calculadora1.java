/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

public class Calculadora1 {
    public double sumar(double n1, double n2) {
        return n1 + n2;
    }

    public double restar(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Error: división por cero.");
            return 0;
        }
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
            return 0;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clone;

/**
 *
 * @author camil
 */import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class SumaMenorParMayorImpar {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(5);
        pila.push(2);
        pila.push(7);
        pila.push(4);
        pila.push(1);

        int menorPar = -1;
        int mayorImpar = -1;

        while (!pila.isEmpty()) {
            int num = pila.pop();
            if (num % 2 == 0 && (menorPar == -1 || num < menorPar)) {
                menorPar = num;
            } else if (num % 2 != 0 && num > mayorImpar) {
                mayorImpar = num;
            }
        }

        int suma = menorPar + mayorImpar;
        System.out.println("Menor elemento par: " + menorPar);
        System.out.println("Mayor elemento impar: " + mayorImpar);
        System.out.println("Suma: " + suma);
    }
}
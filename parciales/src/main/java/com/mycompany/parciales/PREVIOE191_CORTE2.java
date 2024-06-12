/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parciales;

/**
 *
 * @author camil
 */import java.util.Scanner;
import java.util.Scanner;

public class PREVIOE191_CORTE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 1;
        Lista cola = new Lista();

        while (opc != 0) {
            System.out.println("Digite el valor de la cola:");
            int valor = sc.nextInt();
            Nodo nodo = new Nodo(valor);
            cola.insertar(nodo);
            System.out.println("¿Desea crear otro cola? 1-Si, 0-NO");
            opc = sc.nextInt();
        }

        cola.imprimirCola();
        cola.intercalarPrimos().imprimirCola();
    }

    public static class Lista {
        Nodo front;
        Nodo rear;

        public Lista() {
            this.front = null;
            this.rear = null;
        }

        public void insertar(Nodo nodo) {
            if (rear == null) {
                front = rear = nodo;
            } else {
                rear.siguiente = nodo;
                rear = nodo;
            }
        }

        public void Insertar(int valor) {
            Nodo nodo = new Nodo(valor);
            insertar(nodo);
        }

        public boolean Remove() {
            if (front == null) {
                return false;
            }
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.siguiente;
            }
            return true;
        }

        public boolean Empty() {
            return front == null;
        }

        public void imprimirCola() {
            Nodo actual = front;
            while (actual != null) {
                System.out.print(actual.info + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }

        public Lista intercalarPrimos() {
            Lista primos = new Lista();
            Nodo actual = front;
            while (actual != null) {
                if (actual.EsPrimo()) {
                    primos.Insertar(actual.info);
                }
                actual = actual.siguiente;
            }
            Nodo ultimoPrimo = primos.rear;
            while (ultimoPrimo != null) {
                Nodo siguiente = front.siguiente;
                front.siguiente = ultimoPrimo;
                ultimoPrimo = ultimoPrimo.siguiente;
                front.siguiente.siguiente = siguiente;
                front = siguiente;
            }
            return this;
        }
    }

    private static class Nodo {
        int info;
        Nodo siguiente;

        public Nodo(int valor) {
            this.info = valor;
            this.siguiente = null;
        }

        public boolean EsImpar() {
            return this.info  % 2 != 0;
        }

        public boolean EsPrimo() {
            if (this.info <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(info); i++) {
                if (this.info % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
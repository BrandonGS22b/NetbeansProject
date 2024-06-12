/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author camil
 */
public class Mavenproject5 {
    
public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); //Se creo un objeto tipo escanner.
        int x = 1;
        Cola P = new Cola(); // Esta es la cola que vamos a utilizar
        P.primero = null; // Esta cola se encuentra vacia
        int rec = 0;

        //Permite crear un primer NODO
        Nodo r = null; // Puntero temporal para saltar de nodo a nodo
        Nodo n = null; // Creamos un nuevo nodo

        //De aqui en eadelante los que deseemos - NODOS
        while (x != 0) {
            n = new Nodo(); // Creamos un nuevo nodo
            System.out.println("Digite el valor de la cola");
            n.info = sc.nextInt();
            n.siguiente = null;
            if (P.primero == null) {
                P.primero = n;
                r = P.primero;
            } else {
                r.siguiente = n;
                r = r.siguiente;
            }
            System.out.println("Desea crear otro cola 1-Si, 0-NO");
            x = sc.nextInt(); // Si es 1 - Siguie Pidiendo y si es = se sale
        }
        P.imprimirCola();
    }

    public static class Cola {

        Nodo primero;

        //Se encapsulo el codigo Imprimir Cola Como un Metodo.
        public void imprimirCola() {
            Nodo r = primero;
            while (r != null) {
                if (r.info % 2 == 0) {
                    System.out.println("El Nodo " + r.info + " es Par.");
                } else {
                    System.out.println("El Nodo " + r.info + " es Impar.");
                }
                r = r.siguiente;
            }
        }
    }
    public class Cola {

    private Nodo primero;
    private Nodo ultimo;

    public void insertar(Nodo nodo) {
        if (primero == null) {
            primero = nodo;
            ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
            ultimo = nodo;
        }
    }

    public void insertar(int info) {
        Nodo nodo = new Nodo(info);
        insertar(nodo);
    }

    public Nodo remove() {
        Nodo nodo = null;
        if (primero != null) {
            nodo = primero;
            primero = primero.siguiente;
            nodo.siguiente = null;
        }
        return nodo;
    }

    public boolean empty() {
        return primero == null;
    }

    public Cola intercalarPrimos(Cola cola) {
        Cola primos = new Cola();
        Nodo actual = primero;
        Nodo ultimoPrimo = null;
        while (actual != null) {
            if (esPrimo(actual.info)) {
                Nodo nodoPrimo = new Nodo(actual.info);
                if (primos.primero == null) {
                    primos.primero = nodoPrimo;
                    ultimoPrimo = nodoPrimo;
                } else {
                    ultimoPrimo.siguiente = nodoPrimo;
                    ultimoPrimo = nodoPrimo;
                }
            }
            actual = actual.siguiente;
        }
        if (cola != null) {
            actual = cola.primero;
            while (actual != null) {
                if (esPrimo(actual.info)) {
                    Nodo nodoPrimo = new Nodo(actual.info);
                    if (primos.primero == null) {
                        primos.primero = nodoPrimo;
                        ultimoPrimo = nodoPrimo;
                    } else {
                        ultimoPrimo.siguiente = nodoPrimo;
                        ultimoPrimo = nodoPrimo;
                    }
                }
                actual = actual.siguiente;
            }
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static class Nodo {

        int info;
        Nodo siguiente;

        public Nodo() {
        }
    }
}
}

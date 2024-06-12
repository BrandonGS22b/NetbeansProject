/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject6;

import static com.mycompany.mavenproject6.LLC_3Mayo2023.Lista.ingresarNodos;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class LLC_3Mayo2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Se crea un objeto tipo escáner.
        Lista P = new Lista(); // Esta es la lista que vamos a utilizar
        Lista Q = new Lista(); // No está siendo utilizada

        System.out.println("Ingrese nodos para la lista P");
        ingresarNodos(P, sc);
        P.imprimirLista();  // Deseo imprimir una lista lineal circular

        System.out.println("Ingrese nodos para la lista Q");
        ingresarNodos(Q, sc);
        Q.imprimirLista();  // Deseo imprimir una lista lineal circular

        System.out.println("De aquí en adelante está la lista concatenada.");

        // Z es la concatenación de P y de Q
        Lista Z = new Lista(); // No está siendo utilizada  
        Z.primero = null;
        Z = P.Concatenar(Q);
        Z.imprimirLista();

        int sumaPares = Z.sumaPares(P);
        System.out.println("La suma de los valores pares es: " + sumaPares);
        int sumaImpares = Z.sumaImpares(Z);
        System.out.println("La suma de los valores impares es: " + sumaImpares);

    }//Este es el último del Main

    public static class Lista {

        nodo primero;

        //Se encapsulo el codigo Imprimir Lista Como un Metodo.
        public void imprimirLista() {
            nodo r = new nodo();
            r = primero;
            do {
                System.out.println("El Nodo es " + r.info);
                r = r.siguiente;
            } while (r != primero);
        }

        public static int sumaPares(Lista lista) {
            nodo actual = lista.primero;
            int suma = 0;
            do {
                if (actual.Espar() == true) { // Si el valor es par, lo sumamos
                    suma += actual.info;
                }
                actual = actual.siguiente;
            } while (actual != lista.primero);
            return suma;
        }

        public static int sumaImpares(Lista lista) {
            nodo actual = lista.primero;
            int suma = 0;
            do {
                if (actual.Espar() == false) { // Si el valor es impar, lo sumamos
                    suma += actual.info;
                }
                actual = actual.siguiente;
            } while (actual != lista.primero);
            return suma;
        }

        public Lista Concatenar(Lista T) { //REtorna una Lista Circular
            Lista R = new Lista();
            nodo t1 = new nodo();
//            nodo t2 = new nodo();
            nodo r = primero;
            while (r.siguiente != primero) {
                r = r.siguiente;
            }
            r.siguiente = T.primero;
            t1 = T.primero;
            while (t1.siguiente != T.primero) {
                t1 = t1.siguiente;
            }
            t1.siguiente = primero;
            R.primero = t1;
            return R;
        }

        public static void ingresarNodos(Lista lista, Scanner sc) {
            int bandera = 0;
            int opc = 1;
            nodo r = new nodo(); // Puntero temporal para saltar de nodo a nodo
            nodo n = new nodo(); // Creamos un nuevo nodo

            // De aquí en adelante los que deseemos - NODOS en una Circular
            while (opc != 0) {
                if (bandera == 0) {
                    n = new nodo(); // Creamos un nuevo nodo
                    System.out.println("Digite el valor del Nodo");
                    n.info = sc.nextInt();
                    bandera = 1;
                    lista.primero = n;
                    r = lista.primero;
                    n.siguiente = lista.primero; // Enlace el con el mismo.
                } else {
                    n = new nodo(); // Creamos un nuevo nodo
                    System.out.println("Digite el valor del Nodo");
                    n.info = sc.nextInt();
                    n.siguiente = lista.primero;
                    r.siguiente = n;
                    r = r.siguiente;
                }
                System.out.println("Desea crear otro Nodo 1-Si, 0-NO");
                opc = sc.nextInt(); // Si es 1 - Siguie Pidiendo y si es = se sale
            }
        }
    }

    private static class nodo {

        int info;
        nodo siguiente;

        public nodo() {
        }

        public boolean Espar() {
            boolean T = false;
            if (info % 2 == 0) {
                return true;
            }
            return T;
        }

        public boolean EsPrimo() {
            if (info < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(info); i++) {
                if (info % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

}

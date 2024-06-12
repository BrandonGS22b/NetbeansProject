/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista_linal_circular;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class LLC_3Mayo2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se creo un objeto tipo escanner.
        int bandera = 0;
        int opc = 1;
        Lista P = new Lista(); // Esta es la lista que vamos a utilizar
        Lista Q = new Lista(); // No esta siendo utilizada       
        P.primero = null; //Esta lista se encuentra vacia
        Q.primero = null; //Esta lista se encuentra vacia.

        //Permite crear un primer NODO
        nodo r = new nodo(); // Puntero temporal para saltar de nodo a nodo
        nodo n = new nodo(); // Creamos un nuevo nodo

        //De aqui en adelante los que deseemos -  NODOS en una Circular
        while (opc != 0) {
            if (bandera == 0) {
                n = new nodo(); // Creamos un nuevo nodo
                System.out.println("Digite el valor del Nodo");
                n.info = sc.nextInt();
                //n.siguiente = null; // ya no es el NULL
                bandera = 1;
                P.primero = n; // esta lista se llama P
                r = P.primero;
                n.siguiente = P.primero; // Enlace el con el mismo.
            } else {
                n = new nodo(); // Creamos un nuevo nodo
                System.out.println("Digite el valor del Nodo");
                n.info = sc.nextInt();
                n.siguiente = P.primero;   //null; // Ya no es el NULL 
                r.siguiente = n;
                r = r.siguiente;
            }
            System.out.println("Desea crear otro Nodo 1-Si, 0-NO");
            opc = sc.nextInt(); // Si es 1 - Siguie Pidiendo y si es = se sale
        }
        P.imprimirLista();  // Deseo imprimir una lista lineal circular
        //// de aqui en adelante pido Q       
        //De aqui en adelante los que deseemos -  NODOS en una Circular
        opc = 1;
        bandera = 0;
        while (opc != 0) {
            if (bandera == 0) {
                n = new nodo(); // Creamos un nuevo nodo
                System.out.println("Digite el valor del Nodo en Q ");
                n.info = sc.nextInt();
                //n.siguiente = null; // ya no es el NULL
                bandera = 1;
                Q.primero = n; // esta lista se llama P
                r = Q.primero;
                n.siguiente = Q.primero; // Enlace el con el mismo.
            } else {
                n = new nodo(); // Creamos un nuevo nodo
                System.out.println("Digite el valor del Nodo en Q");
                n.info = sc.nextInt();
                n.siguiente = Q.primero;   //null; // Ya no es el NULL 
                r.siguiente = n;
                r = r.siguiente;
            }
            System.out.println("Desea crear otro Nodo 1-Si, 0-NO");
            opc = sc.nextInt(); // Si es 1 - Siguie Pidiendo y si es = se sale
        }
        Q.imprimirLista();  // Deseo imprimir una lista lineal circular       
        System.out.println("De aqui en adelante esta la lista concatenada.");

        // Z es la concatenación de P y de Q
        Lista Z = new Lista(); // No esta siendo utilizada  
        Z.primero = null;
        Z = P.Concatenar(Q);
        Z.imprimirLista();

        int sumaPares = Z.sumaPares(P);
        System.out.println("La suma de los valores pares es: " + sumaPares);

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

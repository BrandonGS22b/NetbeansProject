/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author camil
 */import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class PruebaArbol {
    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;

        System.out.println("Insertando los siguientes valores: ");

        Dato = JOptionPane.showInputDialog("Inserta el número de nodos que desea ingresar");
        int n = Integer.parseInt(Dato);

        for (int i = 1; i <= n; i++) {
            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Árbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();

        int sumEven = arbol.sumaNodosPares();
        System.out.println("\n\nSuma de los nodos pares: " + sumEven);

        int numeroMayor = arbol.obtenerNumeroMayor();
        int numeroMenor = arbol.obtenerNumeroMenor();

        System.out.println("\nNúmero Mayor: " + numeroMayor);
        System.out.println("Número Menor: " + numeroMenor);

        int sumaMayorMenor = numeroMayor + numeroMenor;
        System.out.println("Suma del número mayor y del número menor: " + sumaMayorMenor);
    }

    public static class NodoArbol {
        // miembros de acceso
        NodoArbol nodoizquierdo;
        int datos;
        NodoArbol nododerecho;

        // iniciar dato y hacer de este nodo un nodo hoja
        public NodoArbol(int datosNodo) {
            datos = datosNodo;
            nodoizquierdo = nododerecho = null; // el nodo no tiene hijos
        }

        // buscar punto de inserción e insertar nodo nuevo
        public synchronized void insertar(int valorInsertar) {
            // insertar en subárbol izquierdo
            if (valorInsertar < datos) {
                // insertar en subárbol izquierdo
                if (nodoizquierdo == null)
                    nodoizquierdo = new NodoArbol(valorInsertar);
                else // continuar recorriendo subárbol izquierdo
                    nodoizquierdo.insertar(valorInsertar);
            }
            // insertar nodo derecho
            else if (valorInsertar > datos) {
                // insertar nuevo nodoArbol
                if (nododerecho == null)
                    nododerecho = new NodoArbol(valorInsertar);
                else
                    nododerecho.insertar(valorInsertar);
            }
        } // fin del método insertar
    }

    public static class Arbol {
        private NodoArbol raiz;

        // construir un árbol vacío
        public Arbol() {
            raiz = null;
        }

        // insertar un nuevo nodo en el árbol de búsqueda binaria
        public synchronized void insertarNodo(int valorInsertar) {
            if (raiz == null)
                raiz = new NodoArbol(valorInsertar); // crea nodo raíz
            else
                raiz.insertar(valorInsertar);
        }

        // EMPIEZA EL RECORRIDO EN PREORDEN
        public synchronized void recorridoPreorden() {
            ayudantePreorden(raiz);
        }

        // método recursivo para recorrido en preorden
        private void ayudantePreorden(NodoArbol nodo) {
            if (nodo == null)
                return;

            System.out.print(nodo.datos + " "); // mostrar datos del nodo
            ayudantePreorden(nodo.nodoizquierdo); // recorre subárbol izquierdo
            ayudantePreorden(nodo.nododerecho); // recorre subárbol derecho
        }

        // EMPEZAR RECORRIDO INORDEN
        public synchronized void recorridoInorden() {
            ayudanteInorden(raiz);
        }

        // método recursivo para recorrido inorden
        private void ayudanteInorden(NodoArbol nodo) {
            if (nodo == null)
                return;

            ayudanteInorden(nodo.nodoizquierdo);
            System.out.print(nodo.datos + " ");
            ayudanteInorden(nodo.nododerecho);
        }

        // EMPEZAR RECORRIDO PORORDEN
        public synchronized void recorridoPosorden() {
            ayudantePosorden(raiz);
        }

        // método recursivo para recorrido posorden
        private void ayudantePosorden(NodoArbol nodo) {
            if (nodo == null)
                return;

            ayudantePosorden(nodo.nodoizquierdo);
            ayudantePosorden(nodo.nododerecho);
            System.out.print(nodo.datos + " ");
        }

        // Calcular la suma de los nodos pares en el árbol
        public int sumaNodosPares() {
            return sumaNodosPares(raiz);
        }

        private int sumaNodosPares(NodoArbol nodo) {
            if (nodo == null)
                return 0;

            int suma = 0;
            if (nodo.datos % 2 == 0)
                suma += nodo.datos;

            suma += sumaNodosPares(nodo.nodoizquierdo);
            suma += sumaNodosPares(nodo.nododerecho);

            return suma;
        }

        // Obtener el número mayor en el árbol
        public int obtenerNumeroMayor() {
            if (raiz == null)
                return 0;

            return obtenerNumeroMayor(raiz);
        }

        private int obtenerNumeroMayor(NodoArbol nodo) {
            if (nodo.nododerecho != null)
                return obtenerNumeroMayor(nodo.nododerecho);

            return nodo.datos;
        }

        // Obtener el número menor en el árbol
        public int obtenerNumeroMenor() {
            if (raiz == null)
                return 0;

            return obtenerNumeroMenor(raiz);
        }

        private int obtenerNumeroMenor(NodoArbol nodo) {
            if (nodo.nodoizquierdo != null)
                return obtenerNumeroMenor(nodo.nodoizquierdo);

            return nodo.datos;
        }
    }
}

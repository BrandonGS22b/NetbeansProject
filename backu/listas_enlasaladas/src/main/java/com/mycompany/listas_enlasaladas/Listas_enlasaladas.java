/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listas_enlasaladas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class Listas_enlasaladas {

    public static void main(String[] args) {

        Lista listita = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agreger un Elemento al inicio de la lista \n2. Mostrar los datos de la lista \n"
                        + "3.salir"));

                switch (opcion) {
                    case 1:
                   try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el dato de la lista:"));
                        //AGREGANDO NODO
                        listita.agregaralinicio(el);
                    } catch (NumberFormatException n) {
                        JOptionPane.showInputDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 2:
                        listita.mostrarlistas();
                        break;

                    case 3:
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "opcicion Incorrecta");

                }
            } catch (Exception e) {
                JOptionPane.showInputDialog(null, "Error" + e.getMessage());

            }
        } while (opcion != 3);
    }

    public static class Nodo {

        public int dato;
        public Nodo siguiente;//puntero enlace
        //constructor para insertar al final

        public Nodo(int dt) {
            this.dato = dt;
        }

        //constructor para insertar al inicio
        public Nodo(int dt, Nodo num) {
            dato = dt;
            siguiente = num;
        }
    }

    public static class Lista {

        protected Nodo INICIO, FIN;//puntero para saber donde esta el inicio y el  fin

        public Lista() {
            INICIO = null;
            FIN = null;
        }
//metodo para saber si la lista esta vacia
        
        //metodo para agregar un nodo al inicio de la lista
        public void agregaralinicio(int elemento) {
            //creando al nodo
            INICIO = new Nodo(elemento, INICIO);
            if (FIN == null) {
                FIN = INICIO;
            }
        }

        //METODO PARA MOSTRAR LOS DATOS
        public void mostrarlistas() {
            Nodo recorrer = INICIO;
            System.out.println();
            while (recorrer != null) {
                System.out.print("[" + recorrer.dato + "]--------->");
                recorrer = recorrer.siguiente;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listas_lineal_doblemente_enlazada;

import static com.mycompany.listas_lineal_doblemente_enlazada.LISTAS_LINEAL_DOBLEMENTE_ENLAZADA.ListaDE.encontrarMayorPar;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class LISTAS_LINEAL_DOBLEMENTE_ENLAZADA {

    public static void main(String[] args) {
        int opc = 1; // La bandera que permita capturar datos
        int bandera = 0;
        Scanner sc = new Scanner(System.in); //Se creo un objeto tipo escanner.
        ListaDE P = new ListaDE(); // Esta es la lista que vamos a utilizar
        ListaDE Q = new ListaDE(); // No esta siendo utilizada
        P.Primero = null; //Esta lista se encuentra vacia
        Q.Primero = null; //Esta lista se encuentra vacia.
        //Permite crear un primer NODO
        nodo r; // Puntero temporal para saltar de nodo a nodo
        nodo n = new nodo(); // Creamos un nuevo nodo

        //Inserta Nodos PERO COMO METODO
        System.out.println("Agregue Nodo");
        do {
            // Inserta los Nodos a la lista
            r = new nodo();
            r.info = sc.nextInt();
            P.InsertarNodo(r); // Este insertar es una Cola
            System.out.println("Desea crear Nodo 1-Si, 0-NO");
            opc = sc.nextInt();
            System.out.println("Agregue Nodo");// Si es 1 - Siguie Pidiendo y si es = se sale
        } while (opc != 0);
        System.out.println("Los datos de la Lista son:");
        P.ImprimirLista();
// System.out.println("Digite el Nro de nodo a eliminar");
// int cual=0;
// cual = sc.nextInt();
// P.EliminarEnesimo(cual);
// System.out.println("Los datos de la Lista son:");
// P.ImprimirLista();
// P.ImprimirLista(); //Imprime la Lista de Izquierda a Derecha
        System.out.println("Imprimiendo de Izquierda a Derecha");
        P.ImprimirListaD(); // Ahora Imprimela Lista de Izquierda a Derecha
// //Suma el primero y el último
// P.SumaPrimeroUltimo();
//Dada una LLDE, determinar la cantidad de Números Pares y la suma de los mismos en ella.
        P.SumaPares();

//Dada una LLDE, determinar la cantidad de Números repetidos en ella.
        int cantidadRepetidos = P.CantidadNumerosRepetidos();
        System.out.println("La cantidad de numeros repetidos es: " + cantidadRepetidos);

//Dada una LLDE, determinar el Campo Información que contiene el mayor de los números pares incluidos en la Lista
        int mayorPar = encontrarMayorPar(P);
        System.out.println("El mayor número par es: " + mayorPar);
        


    }

    public static class ListaDE { // Lista lineal Doblemente Enlazada Lineal

        nodo Primero, Ultimo; // Dos puntero de tipo Nodo.

        public ListaDE() { //Un constructor que inicializa lista
            Primero = null;
        }
        //Insertar Nodos

        public void InsertarNodo(nodo a) {
            if (Primero == null) {
                Primero = a;
                Ultimo = a; // Null en el primero
            } else {
                Ultimo.siguiente = a; //Este conecta hacia adelante
                a.anterior = Ultimo; //Conecta hacia atras.
                Ultimo = Ultimo.siguiente;
            }
        }

        public void InsertarNodo(int dato) {
            nodo T = new nodo();
            T.info = dato;
            InsertarNodo(T);
        }

        public void ImprimirLista() //Imprime la Lista de Izquierda a Derecha
        {
            nodo r = new nodo();
            r = Primero;
            while (r != null) {
                System.out.println(r.info);
                r = r.siguiente;
            }
            if (r != null) {
                System.out.println(r.info);
            }
        }

        public void ImprimirListaD() //Imprime la Lista de Izquierda a Derecha
        {
            nodo r = new nodo();
            r = Ultimo;
            while (r != null) {
                System.out.println(r.info);
                r = r.anterior;
            }
            if (r != null) {
                System.out.println(r.info);
            }
        }

        public void SumaPrimeroUltimo() {
            int P = 0, U = 0;
            P = Primero.info;
            U = Ultimo.info;
            if (Primero != null && Ultimo != null) {
                System.out.println("La Suma del Primero y del ultimo es de : " + (P + U));
            }
        }

        public int CantidadNumerosRepetidos() {
            int repetidos = 0;
            nodo actual, comparar;
            for (actual = Primero; actual != null; actual = actual.siguiente) {
                for (comparar = actual.siguiente; comparar != null; comparar = comparar.siguiente) {
                    if (actual.info == comparar.info) {
                        repetidos++;
                    }
                }
            }
            return repetidos;
        }

        public static int encontrarMayorPar(ListaDE lista) {
            int mayor = Integer.MIN_VALUE;
            nodo actual = lista.Primero;
            while (actual != null) {
                if (actual.Es_Par() && actual.info > mayor) {
                    mayor = actual.info;
                }
                actual = actual.siguiente;
            }
            return mayor;
        }

        public void SumaPares() {
            int cantidadPares = 0;
            int sumaPares = 0;
            nodo actual = Primero;
            while (actual != null) {
                if (actual.info % 2 == 0) { // el número es par
                    cantidadPares++;
                    sumaPares += actual.info;
                }
                actual = actual.siguiente;
            }
            System.out.println("Cantidad de números pares: " + cantidadPares);
            System.out.println("Suma de los números pares: " + sumaPares);
        }


    }

    public static class nodo {

        int info;
        nodo siguiente, anterior; //Como es Doblemente Enlazada Siguiente Anterior

        public nodo() {
            siguiente = anterior = null; //Inicializo sig y anterior en Null
        }

        public Boolean Es_Par() {
            Boolean R = true;
            if (info % 2 == 0) {
                R = true;
            } else {
                R = false;
            }
            return R;
        }

        public Boolean Es_Primo() {
            Boolean R = true;
            return R;
        }

    }

}

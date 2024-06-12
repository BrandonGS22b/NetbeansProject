/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.conjunto_22feb;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Conjunto_22feb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declara 3 conunto
        conjunto a, b, c;
        a = new conjunto();//solo cabe 5 elementos
        b = new conjunto();
        c = new conjunto();

        //declarar vectores
        int items[] = new int[a.tamano];
        int contador = a.tamano;
        System.out.println("el tamaño del vector es " + a.tamano);
        System.out.println("conjunto 1");
        while (contador >= 0) {
            System.out.println("DIGITE EL DATO: ");
            items[contador] = sc.nextInt();
            --contador;

        }///////////////////////////////

        c = a.Union(b);
        c = b.Union(a);
        c.imprimir();
        c = new conjunto(items);

    }

    public static class conjunto {

        public int items[];//aqui es donde guardo los elementos del vector
        public int tamano;//es el tamaña del vector
        public int contador;// es la cantidad del vector

        public conjunto() {
            items = new int[5];// solo le cabe 5 elementos de conjunto

        }
        //el siguiente constructor se debe probar 

        public conjunto(int T[]) {// ek tamaño de lo envio como parametro
            items = T;//solo le cabe 5 elementos de conjunto

        }

        public void insertar(int dato) {
            if (Encontrar(dato) == 0) {
                items[contador++] = dato;
            } else {
                System.out.println("ya se encuentra el elemento en el conjunto");
            }

        }
        //probar si funciona

        public void imprimir() {
            for (int i = 0; i <contador; i++) {//length es tamaño
                System.out.println("el dato en la celda: " + i + "  es   " + items[i]);
            }
        }

        public conjunto Union(conjunto a) {
            conjunto T = new conjunto();
            T.contador = 0;
            for (int i = 0; i < a.contador; i++) {
                T.insertar(a.items[i]);
            }
            int i = 0;
            int dato = 0;
            while (true) {
                dato = items[i];
                if (a.Encontrar(dato) == 0) {
                    a.insertar(items[i++]);
                } else {
                    i++;
                }
                if (i == contador) {
                    break;
                }
            }
            return T;
        }

        public int Encontrar(int dato) {
            int encontrado = 0;
            for (int i = 0; i < items.length; i++) {
                if (dato == items[i]) {
                    encontrado = 1;
                }
            }
            return encontrado;
        }

        public conjunto interseccion(conjunto a) {
            conjunto T = new conjunto();
            return T;
        }
    }

}

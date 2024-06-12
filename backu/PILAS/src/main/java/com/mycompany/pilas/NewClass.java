/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author camil
 */
public class NewClass{
        public static void main(String[] args) {
    PILA p = new PILA();
    PILA Espejo_p = new PILA();
    Scanner sc = new Scanner(System.in);
    int Opcion = 1, dato;
    do {
        System.out.println("Escriba el dato a APILAR");
        dato = sc.nextInt();
        p.Apilar(dato);
        System.out.println("Desea APILAR Otro Si = 2 , NO = 1");
        Opcion = sc.nextInt();

    } while (Opcion != 1);
Set<Integer> elementosEncontrados = new HashSet<Integer>();
        PILA resultadoPila = new PILA();
        
        
 while (!p.Esta_Vacia()) {
            int elemento = p.Desapilar();
            if (elementosEncontrados.contains(elemento) && elemento % 2 == 0) {
                resultadoPila.Apilar(elemento);
            } else {
                elementosEncontrados.add(elemento);
            }
        }
    // Vamos a desapilar toda la Pila
    System.out.println("DESAPILANDO LA PILA QUE PREVIAMENTE SE LLENO");
    System.out.println("El que esta en el Tope es: " + p.Tope());
    Espejo_p = p.Copiar();
    while (!p.Esta_Vacia()) {
        System.out.println("El dato desapilado es " + p.Desapilar());
    }
    // Imprimir el resultado
        System.out.println("Elementos que se repiten y son pares en la pila:");
        while (!resultadoPila.Esta_Vacia()) {
            System.out.println(resultadoPila.Tope());
            resultadoPila.Desapilar();
        }
    
    
} //Este es el corchete del Main

// PILA MEDIANTE UNA ESTRUCTURA DE DATOS DINAMICA
public static class PILA {

    ArrayList<Integer> Items; // Realizamos la declaración

    public PILA() {
        Items = new ArrayList<Integer>();
    }

    public PILA(ArrayList<Integer> a) {
        Items = a;
    }

    // OPERACIONES que se realizan en una Pila

    public void Apilar(int dato) {
        Items.add(dato);
    }

    public int Desapilar() {
        int dato;
        if (!Esta_Vacia()) {
            dato = Items.remove(Items.size() - 1);
            return dato;
        } else {
            System.out.println("La PILA se encuentra vacía");
            return -1;
        }
    }

    public boolean Esta_Vacia() {
        if (Items.isEmpty()) {
            System.out.println("Se encuentra vacía");
            return true;
        } else {
            return false;
        }
    }

    public int Tope() {
        if (!Items.isEmpty()) {
            return Items.get(Items.size() - 1);
        } else {
            System.out.println("La PILA se encuentra vacía");
            return -1;
        }
    }

    public PILA Copiar() {
        PILA copia = new PILA();
        copia.Items = (ArrayList<Integer>) Items.clone();
        return copia;
    }
}
}
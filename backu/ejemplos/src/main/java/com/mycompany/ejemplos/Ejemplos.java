/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Ejemplos {

    public static void main(String[] args) {

        ArrayList<Integer> b = new ArrayList<Integer>(); // Los elementos
        ArrayList<Integer> Rb = new ArrayList<Integer>(); // Los repetidos de b
        Boolean O = true;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        while (O) {
            System.out.println("Digite el Número");
            b.add(sc.nextInt()); // los capturo y los agrego a b
            System.out.println("desea Agregar Otro 1 - Si / 0 - NO");
            if (sc.nextInt() == 0) {
                break;
            }
        }
        //Encontrar repetidos
        System.out.println(b);

        while (c < b.size()) {
            if (Encontrado(b, b.get(c))) {
                if (!Encontrado(Rb, b.get(c))) 
                    if(!Rb.contains(b.get(c)))
                    Rb.add(b.get(c));
                
            }
            ++c;
        }
        System.out.println(Rb);
        System.out.println("Cantidad de elementos Repetidos" + Rb.size());
    }

    public static Boolean Encontrado(ArrayList<Integer> T, int E) {
        int contador = 0, dato;
        for (int i = 0; i < T.size(); i++) {
            dato = (int) T.get(i);
            if (dato == E) {
                ++contador;
            }
        }
        if (contador > 1) {
            return true;
        } else {
            return false;
        }

    }
}

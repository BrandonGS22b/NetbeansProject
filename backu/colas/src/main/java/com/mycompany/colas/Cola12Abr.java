/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colas;

import java.util.Scanner;

/**
 *
 * @author camil
 */
import java.util.ArrayList; // Para trabajar ArrayList
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner; //CAPTURA DE DATOS.

public class Cola12Abr {

    public static void main(String[] args) {
        COLA a = new COLA();
        COLA Espejo_a = new COLA();
        Scanner sc = new Scanner(System.in);
        int Opcion = 1, dato;
        do {
            System.out.println("Escriba el dato ACOLAR");
            dato = sc.nextInt();
            a.Acolar(dato);
            System.out.println("Desea ACOLAR Otro Si = 2 , NO = 1");
            Opcion = sc.nextInt();

        } while (Opcion != 1);

     
        // Vamos a desAcolar toda la Cola
        System.out.println("DESACOLANDO LA COLA QUE PREVIAMETE SE LLENO");
        System.out.println("El que esta en Frente es: " + a.Frontal());
        System.out.println("El que esta en la Parte Posterior de la Cola es " + a.Posterior());
        Espejo_a = a.Copiar();
        while (!a.Esta_Vacia()) {
            System.out.println("El desto desAcolado es " + a.DesaColar());
        }
        //Imprima la cantidad de Elemntos pares de la Cola
//        int Pares = 0;
//        dato = 0;
//        while (!Espejo_a.Esta_Vacia()) {
//            dato = Espejo_a.DesaColar();
//            if (dato % 2 == 0) {
//                ++Pares;
//            }
//        }
//        System.out.println("La cantidad de Pares es de: " + Pares);

        //EJERCICIO 2 Dada una cola de n elementos determinar la Suma del Primer elemento de la Cola y el elemento que se encuentra en la parte posterior de la cola.
// 
//        a=Espejo_a.Copiar();
//      int suma= a.Frontal()+a.Posterior();
//        System.out.println("la suma del primero y el ultimo es: "+suma);
        //EJERCICIO 3Dada una cola de n elementos determinar el mayor de los números incluidos en la Cola.
//        int mayor= a.Frontal();
//        a=Espejo_a.Copiar();
//        while(!a.Esta_Vacia()){
//            int actual=a.DesaColar();
//            if(actual>mayor){
//                mayor=actual;
//            }
//        }
//        System.out.println("el mayor es: "+mayor);
//        
        //EJERCICIO 4 Dada una cola de n elementos determinar el Menor de los números pares incluidos en la Cola.
//        int menor=Integer.MAX_VALUE;
//        a=Espejo_a.Copiar();
//        while(!a.Esta_Vacia()){
//            int actual=a.DesaColar();
//            if(actual %2 == 0 && actual<menor){
//                menor=actual;
//            }
//        }
//        if(menor==Integer.MAX_VALUE){
//            System.out.println("no hay elementos pares en la cola");
//        }else{
//            System.out.println("el menor de los pares es:"+menor);
//        }



    } //Este es el Corchete del Main

    // COLA MEDIANTE UNA ESTRUCTURA DE DATOS DINAMICA
    public static class COLA {

        ArrayList<Integer> Items; // Realizamos la declaración
        int FRONT, REAR; // DOS INDICES

        public COLA() {
            Items = new ArrayList<Integer>();
            FRONT = REAR = 0;
        }

        public COLA(ArrayList<Integer> a) {
            Items = a;
            FRONT = 0;
            REAR = Items.size();
        }
        //OPERACIONES que se realizan en una PIla

        public void Acolar(int dato) {
            Items.add(dato);
            FRONT = 0;
            REAR = Items.size();
        }

        public int DesaColar() {
            int dato;
            if (!Esta_Vacia()) {
                dato = Items.remove(0); //FRONT
                return (dato);
            } else {
                System.out.println("La COLA se encuentra vacia");
                return -1;
            }
        }

        public boolean Esta_Vacia() {
            if (Items.size() == 0) { // No tiene elemento esta vacia la cola
                System.out.println("Se encuentra vacio");
                return true;
            } else {
// System.out.println("Tiene Elementos");
                return false;

            }
        }

        public int Frontal() { // Es el mismo StackTop visto en clase
            if (!Items.isEmpty()) {
                return Items.get(0); // FRONT
            } else {
                System.out.println("La COLA se encuentra vacia");
                return -1;
            }
        }

        public int Posterior() { // Es el mismo StackTop visto en clase
            int dato;
            if (!Items.isEmpty()) {
                dato = Items.get(Items.size() - 1);
                return dato;
            } else {
                System.out.println("La COLA se encuentra vacia");
                return -1;
            }
        }

        public COLA Copiar() {
            COLA co = new COLA();
            co.Items = (ArrayList) Items.clone(); ///
            if (Items.size() > 0) {
                co.FRONT = 0;
                co.REAR = Items.size();
            }
            return co;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demarzo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author camil
 */
public class App {

    public static void main(String[] args) {

//creando variables
        PILA a = new PILA();
        PILA Espejo_a = new PILA();
        Scanner sc = new Scanner(System.in);
        int Opcion = 1, dato;

        do {
            System.out.println("Escriba el valor a apilar");
            dato = sc.nextInt();
            a.Apilar(dato);// en la variable a esta ingresando el dato 

            System.out.println("Desea agregas otro Si=2, No=1");
            Opcion = sc.nextInt();

        } while (Opcion != 1);// si la opcion es diferente de 1
        Espejo_a = a.Copiar(); //significa que se está creando una copia del objeto a y asignándola a la variable Espejo_a.
/////////////////////////////////////////////////////////////////////////////////
        //Creacion de la Pila b para el segundo Ejercicio,
        PILA b = new PILA();
        b = a.Copiar();

        //Imprimir los datos de la pila
        System.out.println("------------------------------------------");
        while (!Espejo_a.Esta_Vacia()) { // El siguiente bucle saca elementos de Espejo_a y los muestra en la consola
            System.out.println("El dato DesApilado en Espejo es: " + Espejo_a.DesApilar());
        }
        System.out.println("---------------------------------------------- ");
        while (!a.Esta_Vacia()) {
            System.out.println("El dato DesApilado en la Pila Original es: " + a.DesApilar());
        }

//     EJERCICIO NUMERO 1: La cantidad y suma de los elementos pares
//      System.out.println("************Ejercicio Jueves No1");
//      Espejo_a = b.Copiar(); //Creo un espejo de la pila para utilizarlo mas adelante
//      int c = 0;
//      while(!Espejo_a.Esta_Vacia()){
//          dato = Espejo_a.DesApilar();
//          if(dato%2 == 0){
//              ++c;
//              System.out.println("Es par: "+dato);
//          }
//        }
//      System.out.println("Numero de elementos pares es de "+c);
//      //EJERCICIO NUMERO 2:    Suma del tope mas el más profundo
//      System.out.println("*********Ejercicio Jueves No 2 Suma del tope mas el más profundo");
//      int Profundo = 0;
//      if(!b.Esta_Vacia()){
//          dato = b.Tope;
//          while(!b.Esta_Vacia()){
//            Profundo = b.DesApilar();  
//          }
//          System.out.println("La suma del Tope y el más profundo es de: "+(dato+Profundo));
//        }
        //EJERCICIO NUMERO 4 determinar el mayor de los numeros pares
//      int MPar = 0, datoP = 0;
//      while(!b.Esta_Vacia()){
//          datoP = b.DesApilar();
//          if(datoP%2 == 0 && datoP>MPar){
//           MPar = datoP;
//            
//          }
//      }
//      System.out.println("El mayor de los pares es: "+MPar);
//ejercio no 4.1 determinar el menor de los numeros pares
//       
// int  datoP = 0;
// int MIN = Integer.MAX_VALUE;
//   while(!b.Esta_Vacia()){
//          datoP = b.DesApilar();
//          if(datoP % 2 == 0 && datoP<MIN){
//             
//           MIN = datoP;
//           
//          }
//
//      }
//        System.out.println("el menor de los pares es:" + (MIN != Integer.MAX_VALUE ? MIN : "No se encontró número par en la pila."));
//Ejercicio No 5 Determinar la suma del menor elemento par mas el mayor elemento impar
// System.out.println("***************Ejercicio Jueves No 5 Suma de menor par mas el mayor impar");
//        int menorPar = -1;
//        int mayorImpar = -1;
//
//        while (!b.Esta_Vacia()) {
//            int num = b.DesApilar();
//            if (num % 2 == 0 && (menorPar == -1 || num < menorPar)) {
//                menorPar = num;
//            } else if (num % 2 != 0 && num > mayorImpar) {
//                mayorImpar = num;
//            }
//        }
//
//        int suma = menorPar + mayorImpar;
//        System.out.println("Menor elemento par: " + menorPar);
//        System.out.println("Mayor elemento impar: " + mayorImpar);
//        System.out.println("Suma: " + suma);
// ejercicio 6 ENCONTRAR EL MENOR DE LOS IMPARES
// int  datoP = 0;
// int MENOR = Integer.MAX_VALUE;
//   while(!b.Esta_Vacia()){
//          datoP = b.DesApilar();
//          if(datoP % 2 != 0 && datoP<MENOR){
//           MENOR = datoP;
//           
//          }
//
//      }
//   if(MENOR==Integer.MAX_VALUE){
//       System.out.println("No se encontraron números impares en la pila.");
//   }else{
//            System.out.println("El menor número impar en la pila es: " + MENOR);
//   }
//7- INTERCALAR LOS ELEMENTOS IMPARES DE LA PRIMERA ENTRE LOS ELEMENTOS PARES DE LA SEGUNDA.
//        PILA pares = new PILA();
//        PILA impares = new PILA();
//        PILA intercalada = new PILA();
//
//        while (!b.Esta_Vacia()) {
//            int num = b.DesApilar();
//            if (num % 2 != 0) {
//                impares.Apilar(num);
//            } else {
//                pares.Apilar(num);
//            }
//        }
//
//        // Intercalar impares y pares
//        while (!impares.Esta_Vacia() && !pares.Esta_Vacia()) {
//            intercalada.Apilar(pares.DesApilar());
//            intercalada.Apilar(impares.DesApilar());
//        }
//
//        // Agregar elementos restantes
//        while (!impares.Esta_Vacia()) {
//            intercalada.Apilar(impares.DesApilar());
//        }
//
//        while (!pares.Esta_Vacia()) {
//            intercalada.Apilar(pares.DesApilar());
//        }
//
//        // Imprimir la pila intercalada
//        while (!intercalada.Esta_Vacia()) {
//            System.out.print(intercalada.DesApilar() + " ");
//    }
// 8- DETERMINAR EL MAYOR PRIMO.
int mayorp=0;
int datop0;
while(!b.Esta_Vacia()){
    dato=b.DesApilar();
    if(b.esprimo(dato)){
        if(dato > mayorp){
            mayorp=dato;
        }
        
    }
}
        System.out.println("el mayor primo de la pila es: "+mayorp);
////
    }

//PILA MEDIANTE UNA ESTRUCTURA DE DATOS DINAMICA
    public static class PILA {

        ArrayList<Integer> Items;//Realizamos la declaracion y items es el espacio de cada pila 
        int Tope;//es el ultimo numero del elemento
        int Top;//es el de la ubicacion

        public PILA() {
            Items = new ArrayList<Integer>();
            Tope = 0;
            Top = -1;
        }
        /////////////////// añadir elementos a la pila ///////////////

        public PILA(ArrayList<Integer> a) {
            Items = a;
            Tope = a.get(a.size() - 1);// significa que esta asignando el valor del ultimo elemento del arreglo
            Top = a.size() - 1;
        }

        //Operaciones que se realizan en una Pila 
        //agregar
        public void Apilar(int dato) {
            Items.add(dato);//asignar datos a a pila 
            Tope = dato;
            Top = Items.size() - 1;//Es un indice y  significa que se está asignando el índice del último elemento en la lista
        }
        /////////////////quitar

        public int DesApilar() {
            if (!Esta_Vacia()) { // aca dice no esta vacia 
                Top = Items.size() - 1;
                Tope = Items.get(Top);//Revisar
                return Items.remove(Top);// eliminar el elemento superior y  obtenerlo tambien es como devolver el elemento eleminado 
            } else {
                System.out.println("La Pila se encuentra vacia");
                return -1;
            }
        }
//////////////////////////////////////////////////////////////

        public boolean Esta_Vacia() {
            //si el tamaño de items es igual  a 0 o si es top es igual a -1
            if (Items.size() == 0 || Top == -1) {//No tiene elemento esta vacio
                System.out.println("Se encuentra vacio");
                return true;
            } else {
//             System.out.println("Tiene Elementos");
                return false;
            }
        }
/////////////////////////////////////////////////////////////////////////

        public int ElTope() {//Es el mismo StackTop visto en clase
            if (Items.isEmpty()) {//si la lista Items está vacía"
                return Items.get(Top);//utiliza para devolver el elemento superior de una estructura de datos tipo pila o stack.
            } else {
                System.out.println("La pila se encuentra vacia");
                return -1;
            }
        }
///////////////////////////////////////////////////////////

        public PILA Copiar() {
            PILA co = new PILA();
            //guarda uan copia 
            co.Items = (ArrayList) Items.clone(); // se utiliza para crear una copia de un objeto. 
            if (Items.size() > 0) {
                //Obtener el último elemento de la lista y asignarlo a co.Tope
                co.Tope = Items.get(co.Items.size() - 1);
                co.Top = Top;
            }
            return co;
        }
        ////////////////////////////////////////////////////////////////////////
        public static boolean esprimo(int dato){
            if(dato <=1){
                return false;
            }for(int i =2; i <=Math.sqrt(dato);i++){
                if(dato % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}

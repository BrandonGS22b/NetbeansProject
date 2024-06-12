/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vectorcomoparametro;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Vectorcomoparametro {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //declarar vectores
        int items[], contador=0;
        items =new int[5];
        while(contador<items.length){
            System.out.println("digite el dato");
            items[contador++]=sc.nextInt();//++contador contador++
        }
        cargar(items);
    }
    public static void cargar(int V[]){
        int contador=0;
        while(contador < V.length){
            System.out.println("EL VALOR DE LA CELDA " + contador +" es de "+ V[contador]);
            ++contador;
        }
    }
    
}

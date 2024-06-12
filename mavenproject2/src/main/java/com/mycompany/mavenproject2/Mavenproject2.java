/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Mavenproject2 {

    public static void main(String[] args) {
      
           System.out.print("INGRESE EL TITULO DEL LIBRO:");
           Scanner consola = new Scanner (System.in);
           String parrafo=consola.nextLine();
           System.out.print("INGRESE EL NOMBRE DEL AUTOR:");
           String nombre=consola.nextLine();
           System.out.println("titulo del libre es: " + parrafo + " " + "nombre: " + nombre);
      
    }
}
\
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fase1;

/**
 *
 * @author camil
 */
public class Fase1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
       
        System.out.print("ingrese su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("hola  " + nombre);
        
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        
        miVariableEntera=5;
        System.out.println(miVariableEntera);
        
        String miVariablecadena="saludos";
        System.out.println(miVariablecadena);
        
        miVariablecadena="adios";
        System.out.println(miVariablecadena);
        
        //var-inferencia de tipos de java
        var miVariableEntera2 = 15;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        var miVariableCadena2="nueva cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //valores pemitidos en el nombre de variables
        var miVariable=1;
        var _miVariable=2;
        var $miVariable=3;
    }
}

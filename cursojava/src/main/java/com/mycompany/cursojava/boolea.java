/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class boolea {
    public static void main (String args[]){
        var  edad=0;
       Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese la edad:");
        edad=leer.nextInt();
       
        if(edad >=18){
            System.out.println("es mayor");
        }else if(edad <18){
            System.out.println("es menor");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author camil
 */
public class Cursojava {

    public static void main(String[] args) {
        /*
        tipos primitivos enteros: int,short,long,byte
        */
        byte numerobyte = (byte) 129;
        System.out.println("valor del byte es:" + numerobyte);
        System.out.println("Valor maximo del byte es:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo del byte es:" + Byte.MIN_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        short numeroshort = 10;
        System.out.println("numeroshort = " + numeroshort);
        System.out.println("valor maximo es:" + Short.MAX_VALUE);
        System.out.println("valor minimo es:" + Short.MIN_VALUE);
        System.out.println("-----------------------------------------------------------------------------");

        int numeroint = 89;
        System.out.println("numeroint = " + numeroint);
        System.out.println("valor maximo es:" + Integer.MAX_VALUE);
        System.out.println("valor minimo es:" + Integer.MIN_VALUE);
        System.out.println("-----------------------------------------------------------------------------");

        long numerolong = 45;
        System.out.println("numerolong = " + numerolong);
        System.out.println("valor maximo es:" + Long.MAX_VALUE);
        System.out.println("valor minimo es:" + Long.MIN_VALUE);
    }
}

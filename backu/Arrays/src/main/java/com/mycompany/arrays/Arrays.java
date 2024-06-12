/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays;

import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class Arrays {

    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.get(0);
        cars.set(0, "Opel");
        cars.remove(0);
        cars.clear();
        for(int i=0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }
       
        
    }
    public void parte(String[] args){
         ArrayList<String> cars= new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        for(int i=0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }
        System.out.println(cars);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author camil
 */
public class partefor {
    
    public void parte(String[] args){
         ArrayList<String> cars= new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        Collections.sort(cars);
         for(String i : cars){
            System.out.println(i);
        }
    }
}

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
public class numeros {
    
    public void parte(String[] args){
         ArrayList<Integer> mynum= new ArrayList<Integer>();
        mynum.add(10);
        mynum.add(20);
        mynum.add(30);
        mynum.add(40);
        
Collections.sort(mynum);
         for(int i : mynum){
            System.out.println(i);
        }
    }
    
}

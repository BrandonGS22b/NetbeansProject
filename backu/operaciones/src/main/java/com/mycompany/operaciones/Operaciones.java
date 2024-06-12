/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operaciones;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Operaciones {

    public static void main(String[] args) {
        Scanner palabra =new Scanner(System.in);
                Scanner stri =new Scanner(System.in);
 conjuntos obj = new conjuntos();
 int x=0;
 int o=0;
 String U=" ";
 
        System.out.println("¿cuantos conjuntos desea? \n(minimo 2 maximo 3)");
        x=palabra.nextInt();
        if(x>3){
            System.out.println("solo se puede ingresas minimo 2 maximo 3 \n vuelve a ingresas");
            x=palabra.nextInt();
        }
        System.out.println(" ");
         obj.metodos(x);
         System.out.println("");
         
         while(o!=3)
         {
             System.out.println("¿que operacion desea hacer?");
             System.out.println("1.Union\n2.Interseccion\n3.cerrar programa");
             System.out.println("escriba el numero de la obcion que desea");
             o=palabra.nextInt();
             
             switch(o)
             {
                 case 1: System.out.println("los conjuntos los debe escribir en mayuscula");
                     System.out.println("Union se pone una U mayuscula entre los conjuntos.\nejemplo:AUB,AUC");
                     U=stri.nextLine();
                     obj.Union(U);
                     break;
                     
                 case 2: System.out.println("los conjuntos los debe escribir en mayuscula");
                     System.out.println("Union se pone una n minuscula entre los conjuntos.\nejemplo:AnB,AnC");
                     U=stri.nextLine();
                     obj.Interseccion(U);
                     break;
                 case 3: System.out.println("el programa a finalizado");
             }
         }
    }
}

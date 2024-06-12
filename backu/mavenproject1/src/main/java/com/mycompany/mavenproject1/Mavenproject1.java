/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    Scanner leer = new Scanner(System.in);

 System.out.println("buenas");
 System.out.println ("tenga en cuenta que antes  de registrar a los estudiantes debe tener  a la mano lo siguintes datos nombre,documento,genero y la edad");
int x=0;
String ES[][] = new String[2][5];
int EI[][] = new int[2][5];
System.out.println("INGRESE EL NUMERO DE ESTUDIANTES QUE DESEA REGISTRAR: ");
x=leer.nextInt();

    for (int i=0;i<x;i++)
    {
        System.out.println("INGRESE EL NOMBRE: ");
        ES[0][i]= leer.next();
      System.out.println("INGRESE EL DOCUMENTO SIN PUNTOS: ");
      EI[0][i] = leer.nextInt();
      System.out.println("INGRESE EL GENERO DEL ESTUDIANTE (f:femenino,m:masculino): ");
      ES[1][i]  = leer.next();
      System.out.println("INGRESE LA EDAD");
     EI[1][i] = leer.nextInt();
     
    }
    System.out.println(" ");
    System.out.println("EL REGITRO FUE UN EXITO ");
    System.out.println(" ");
    System.out.println("REGISTRO DE LOS ESTUDIANTES");
    for(int i=0;i<x;i++)
    {
        System.out.println("Nombre: "+ ES[0][i]+ " Documento: "+EI[0][i]+" Edad: "+EI[1][i]+" Genero: "+ES[1][i]);
        
    }
    int cm = 0;
    int cf = 0;
    for(int i=0;i<x;i++){
        if("m".equals(ES[1][i])){
            cm++;
        }else{cf++;}
    }
    System.out.println(" ");
    System.out.println("CUANTOS ESTUDIANTES HOMBRES Y MUJERES HAY");
    System.out.println("numero de hombres: "+cm +" el  numero de mujeres: "+cf);

    int ME = 0;
    int MM = 200;
    int promedio= 0;
    int MH=0;
    int y = 0;
    int z = 0;
    int w = 0;
    int FM = 200;
    int v=0;
    int contador=0;


    for (int i=0;i<x;i++){
    if (EI[1][i]>= ME){
        ME = EI[1][i];
        y= i;
    }else if(EI[1][i]<MM){
MM =EI[1][i];
w = i;

    }
   
    if("m".equals(ES[1][i]) && EI[1][i] > MH){
MH = EI[1][i];
z=i;
    }
    if("f".equals(ES[1][i])&& EI[1][i]< FM){
        FM = EI[1][i];
        v=i;
    }
    if(EI[1][i]>=18){
        contador++;
                }

 promedio = EI[1][i]+promedio;
 
    }
    promedio= promedio/x;
    System.out.println(" ");
    System.out.println("CUAL ES EL ESTUDIANTE CON MAYOR EDAD");
System.out.println("el estudiante con mayor edad es: "+ ES[0][y] + " Con: " + ME);

System.out.println(" ");
    System.out.println("CUAL ES EL ESTUDIANTE CON MENOR EDAD");
    System.out.println("el estudiante con menor edad es: "+ ES[0][w] + " Con: " + MM);

    System.out.println(" ");
    System.out.println("CUAL ES EL ESTUDIANTE MASCULINO CON MAYOR EDAD");
   System.out.println("el estudiante  masculino con mayor edad es: "+ ES[0][z] + " Con: " + MH);

   System.out.println(" ");
   System.out.println("CUAL ES EL ESTUDIANTE FEMENINO CON MAYOR EDAD");
       System.out.println("el estudiante femenino con menor edad es: "+ ES[0][v]+ " con: " + FM);

       System.out.println(" ");
       System.out.println("CUANTO ESTUDIANTES SON DE MAYOR EDAD");
   System.out.println(" son de mayor edad: "+contador);
   System.out.println(" ");
     System.out.println("EL PROMEDIO DE LAS EDADES DE LOS ESTUDIANTES ES: "+promedio);

     System.out.println(" ");
     System.out.println("GRACIAS");
     System.out.println(" QUE TENGA UN BUEN DIA  ");

}
}

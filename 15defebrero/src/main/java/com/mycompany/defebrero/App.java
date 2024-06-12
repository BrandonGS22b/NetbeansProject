/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//tag FRACCIONARIO
package com.mycompany.defebrero;


public class App {

    public static void main(String[] args) {
      FRACCIONARIO a = new FRACCIONARIO();
            FRACCIONARIO b = new FRACCIONARIO();
                  FRACCIONARIO c = new FRACCIONARIO();
                                    FRACCIONARIO K = new FRACCIONARIO();
                    FRACCIONARIO J = new FRACCIONARIO();
                    FRACCIONARIO L = new FRACCIONARIO();
                  a.NUMERADOR =15;
                  a.DENOMINADOR=4;
                  b.NUMERADOR=23;
                  b.DENOMINADOR = 4;
                  c=suma(a,b);
                  K=resta(a,b);
                   J=multiplicacion(a,b);
                    L=division(a,b);
                  System.out.println("EL RESULTADO ES: " + c.NUMERADOR + "/"+ c.DENOMINADOR);
                   System.out.println("EL RESULTADO  DE LA RESTA ES: " + K.NUMERADOR + "/"+ K.DENOMINADOR);
                                      System.out.println("EL RESULTADO  DE LA MULTIPLICACION ES: " + J.NUMERADOR + "/"+ J.DENOMINADOR);
                                         System.out.println("EL RESULTADO  DE LA DIVISION ES: " + L.NUMERADOR + "/"+ L.DENOMINADOR);

    }
    ////OPERADOR DE TAD
    public  static FRACCIONARIO suma(FRACCIONARIO a,FRACCIONARIO b){
        int N =0,D=0;
        if(a.DENOMINADOR == b.DENOMINADOR){      ///FRACCIONARIO HOMOGENEO 
           N= a.NUMERADOR + b.NUMERADOR;
           D= a.DENOMINADOR;
        }
        FRACCIONARIO T = new FRACCIONARIO();
        T.NUMERADOR = N;
        T.DENOMINADOR = D;
        
        return T;
        
    }
    
      public static FRACCIONARIO resta(FRACCIONARIO a,FRACCIONARIO b){
          int N=0,D=0;
          if(a.DENOMINADOR==b.DENOMINADOR){
              N= a.NUMERADOR - b.NUMERADOR;
               D= a.DENOMINADOR;
        }
        FRACCIONARIO T = new FRACCIONARIO();
        T.NUMERADOR = N;
        T.DENOMINADOR = D;
          
        return T;
    }
        public static  FRACCIONARIO multiplicacion(FRACCIONARIO a,FRACCIONARIO b){
        int N=0,D=0;
          if(a.DENOMINADOR==b.DENOMINADOR){
              N= a.NUMERADOR * b.NUMERADOR;
               D= a.DENOMINADOR*b.DENOMINADOR;
        }
        FRACCIONARIO T = new FRACCIONARIO();
        T.NUMERADOR = N;
        T.DENOMINADOR = D;
          
        return T;
    }
          public static FRACCIONARIO division (FRACCIONARIO a,FRACCIONARIO b){
        int N=0,D=0;
          if(a.DENOMINADOR==b.DENOMINADOR){
              N= a.NUMERADOR*b.DENOMINADOR;
               D= a.DENOMINADOR*b.NUMERADOR;
        }
        FRACCIONARIO T = new FRACCIONARIO();
        T.NUMERADOR = N;
        T.DENOMINADOR = D;
          
        return T;
    }
    /////////////////////////////////////////
    public  static class FRACCIONARIO {
        int NUMERADOR;
        int DENOMINADOR;
    }
            
}

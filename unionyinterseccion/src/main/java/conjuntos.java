
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class conjuntos {
     Scanner leer = new Scanner(System.in);
    String A[];
    String B[];
    String C[];
    String a[];

    String conjunto1;
    String conjunto2;
    String conjunto3;

    public void metodos(int x) {
        A = new String[5];
        B = new String[5];
        C = new String[5];

        while (x < 6) {
            switch (x) {
                case 1:
                    System.out.println("no se puede con un solo conjunto");
                    System.out.print("minimo 2 o maximo 3");
                    x = leer.nextInt();
                    break;

                case 2:
                    System.out.println("ingrese los datos del conjunto A");
                    for (int i = 0; i < 5; i++) {
                        A[i] = leer.nextLine();
                    }
                    System.out.println("");

                    System.out.println("ingrese los datos del conjunto B");
                    for (int b = 0; b < 5; b++) {
                        B[b] = leer.nextLine();
                    }
                    x=6;
                    break;
                    
                case 3: 
                    System.out.println("ingrese los datos del conjunto A");
                    for (int i = 0; i < 5; i++) {
                        A[i] = leer.nextLine();
                    }
                    System.out.println("ingrese los datos del conjunto B");
                    for (int i = 0; i < 5; i++) {
                        B[i] = leer.nextLine();
                    }
                    System.out.println("");
                     System.out.println("ingrese los datos del conjunto c");
                    for (int i = 0; i < 5; i++) {
                        B[i] = leer.nextLine();
                    }
                    x=6;
                    break; 
                    
            }
        }

    }
    public void Union(String U){
        a=new String[10];
        int i =0;
        System.out.println("Union es");
        System.out.print("R=(");
        
        if(U.equals("AUB")  ||  U.equals("BUA")){
            for(int j=0;j<A.length; j++){
                a[j]=A[j];
            }
            for(int j=5;j<10; j++){
                a[j]=B[i];
                i++;
            }
            for(int j=0;j<10; j++){
                System.out.print(a[j]+" ");
            }
        }
        if(U.equals("AUC")  || U.equals("CUA")){
            for(int j=0;j<A.length; j++){
                a[j]=A[j];
            }
            for(int j=5;j<10; j++){
                a[j]=C[i];
                i++;
            }
            for(int j=0;j<10; j++){
                System.out.print(a[j]+" ");
            }
        }
        if(U.equals("BUC")  || U.equals("CUB")){
            for(int j=0;j<A.length; j++){
                a[j]=B[j];
            }
            for(int j=5;j<10; j++){
                a[j]=C[i];
                i++;
            }
            for(int j=0;j<10; j++){
                System.out.print(a[j]+" ");
            }
        }
        System.out.println("}");
        System.out.println("\n");
    }
    public void Interseccion (String U){
        a= new String[5];
         System.out.println("interseccion  es");
        System.out.print("R=(");
        String b="1";
        
        if(U.equals("AnB")  || U.equals("BnA")){
            for(int i=0;i<A.length;i++){
                if(A[0].equals(B[i])  || A[1].equals(B[i]) || A[2].equals(B[i]) || A[3].equals(B[i]) || A[4].equals(B[i]) ){
                    a[i]=B[i];
                }
                if(a[i] != null)
                    System.out.println(a[i]+" ");
            }
        }
        if(U.equals("AnC")  || U.equals("CnA")){
            for(int i=0;i<A.length;i++){
                if(A[0].equals(B[i])  || A[1].equals(B[i]) || A[2].equals(B[i]) || A[3].equals(B[i]) || A[4].equals(B[i]) ){
                    a[i]=C[i];
                }
                if(a[i] != null)
                    System.out.println(a[i]+" ");
        
    }
        }
        if(U.equals("BnC")  || U.equals("CnB")){
            for(int i=0;i<A.length;i++){
                if(A[0].equals(B[i])  || A[1].equals(B[i]) || A[2].equals(B[i]) || A[3].equals(B[i]) || A[4].equals(B[i]) ){
                    a[i]=C[i];
                }
                if(a[i] != null)
                    System.out.print(a[i]+" ");
            }
        }
        System.out.print(")");
        System.out.println("\n");

}
}

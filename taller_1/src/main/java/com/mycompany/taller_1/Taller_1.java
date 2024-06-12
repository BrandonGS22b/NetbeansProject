/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller_1;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Taller_1 {
//YAHIR ANDRES DURAN CRISTANCHO
//BRIGGITH MILEIDY CALA PIEDRAHITA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conjunto a,b,c;
        
        a = new Conjunto();
        b = new Conjunto();
        c = new Conjunto();
        System.out.println("\n *******************************************\n"+
                " Digite los elementos del primer vector" +
                "\n *******************************************\n");
        int opcion=1,c1=0;
        while(opcion == 1){
            System.out.println("Digite el valor del dato del conjunto a");
            a.Insertar(sc.nextInt());
            System.out.println("Deseo agregar otro elemento 1 SI / 0 NO");
            opcion = sc.nextInt();
            if(a.contador == 5){
                break;
            }
        }
        System.out.println("\n *******************************************\n"+
                " Digite los elementos del segundo vector" +
                "\n *******************************************\n");
        opcion=1;
        c1=0;
        while(opcion == 1){
            System.out.println("Digite el valor del dato del conjunto b");
            b.Insertar(sc.nextInt());
            System.out.println("Deseo agregar otro elemento 1 SI / 0 NO");
            opcion = sc.nextInt();
            if(b.contador == 5){
                break;
            }
        }
        
        System.out.println("\n *******************************************\n"+
                " Conjunto a" +
                "\n *******************************************\n");
        System.out.println("Cantidad de elementos " + a.contador);
        a.Imprimir();
        
        System.out.println("\n *******************************************\n"+
                " Conjunto b" +
                "\n *******************************************\n");
        System.out.println("Cantidad de elementos " + b.contador);
        b.Imprimir();
        
        System.out.println("\n *******************************************\n"+
                " Union de Vectores" +
                "\n *******************************************\n");
        c = a.Union(b);
        c.Imprimir();
        
        System.out.println("\n *******************************************\n"+
                " Interseccion de Vectores" +
                "\n *******************************************\n");
        c = a.Interseccion(b);
        c.Imprimir();
        
        System.out.println("\n *******************************************\n"+
                " DiferenciaSimetrica de Vectores" +
                "\n *******************************************\n");
        c = a.DiferenciaSimetrica(b);
        c.Imprimir();
        
        ;  
    }
    
    public static class Conjunto{
        int items[];
        int tamaño;
        int contador;
        
        public Conjunto(){
            items = new int[10];
        }
        
        public Conjunto(int v[]){
            items = v;
        }
        
        public void Insertar(int dato){
            if (Encontrar(dato)==false){
                items[contador++]=dato;
            }else{
                System.out.println("Ya se encuentra el elemento en el conjunto");         
            }
        }
        
        public boolean Encontrar(int dato){
            boolean encontrado=false;
            for(int i=0;i<items.length;i++){
                if(dato==items[i]){
                    encontrado =true;
                }
            }
            return encontrado;
        }
        
        public void Imprimir(){
            for(int i=0; i<contador; i++){
                System.out.println("Elemetos del conjunto " + items[i]);
            }
        }
        
        public void InsertarDato(int dato){
            if (Encontrar(dato)==false){
                items[contador++]=dato;
            }
        }
        
        public Conjunto Union(Conjunto datoo){
            Conjunto R = new Conjunto();
            R.contador=0;
            for(int  i=0; i<datoo.contador;i++){
                R.Insertar(datoo.items[i]);
            }
            int i=0, dato=0;
            while(true){
                dato = items[i];
                if(R.Encontrar(dato) == false ){
                    R.Insertar(items[i++]);
                }else{
                    ++i;
                }if(i==contador){
                    break;
                }
            }
            return R;
        }
        
        public Conjunto Interseccion(Conjunto dat){
            Conjunto T = new Conjunto();
            T.contador=0;
            for(int i=0;i<items.length;i++){
                if(dat.Encontrar(items[i])==true){
                    T.InsertarDato(items[i]);
                }
            }
            return T;
        }
        
        public Conjunto DiferenciaSimetrica(Conjunto diferencia){
            //SE CREA UN CONJUNTO AUXILIAR PARA GUARDAR EL CONJUNTO PRINCIPAL 
            Conjunto Z = new Conjunto();
            Z.contador=0;
            Conjunto D = new Conjunto();
            D.contador=0;
            for(int i=0;i<items.length;i++){
                Z.InsertarDato(items[i]);
            }
            for(int i=0;i<items.length;i++){
                if(diferencia.Encontrar(items[i])==false){
                    D.InsertarDato(items[i]);
                }
            }
            for(int i=0;i<diferencia.items.length;i++){
                if(Z.Encontrar(diferencia.items[i])==false){
                    D.InsertarDato(diferencia.items[i]);
                }
            }
            return D;
        }
        
       
    }
}
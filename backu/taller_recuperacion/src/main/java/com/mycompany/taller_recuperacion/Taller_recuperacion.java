/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.taller_recuperacion;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Taller_recuperacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conjunto a, b, c;

        a = new Conjunto();
        b = new Conjunto();
        c = new Conjunto();
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("ingrese los datos del primer vector\n"
                + "");

        //declaramos las variables
        int elemento = 1;
        int P1 = 0;

        while (elemento == 1) {
            System.out.println("ingrese los datos del conjunto a");
            a.Agregar(sc.nextInt());
            if (a.contador == 5) {
                break;
            }

        }
/////////////////////////////////////////////////////////////
        //ya estan declaradas
        elemento = 1;
        P1 = 0;

        while (elemento == 1) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("ingrese los datos del conjunto b");
            b.Agregar(sc.nextInt());
            if (b.contador == 5) {
                break;
            }

        }
        
/////////////conjunto a
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Cantidad de datos del conjunto a son: " + a.contador);
///////////conjunto b
System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Cantidad de datos  del conjunto b son:" + b.contador);
        
        
        
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("los datos ingresados del conjunto a fueron:");
        a.Imprimir();
        
          System.out.println("------------------------------------------------------------------");
        System.out.println("los datos ingresados del conjunto b fueron:");
        b.Imprimir();
////////////////////////////////////// parte de la union 
        System.out.println("----------------------------------------------------------------------------------------------");
          System.out.println( " la UNION ES:");
        c = a.Union(b);
        c.Imprimir();

        
        //////////////////////////////////////PARTE DE LA INTERSECCION
        System.out.println("-------------------------------------------------------------------------");
          System.out.println( " LA INTERSECION ES:");
        c = a.Interseccion(b);
        c.Imprimir();

        System.out.println("-----------------------------------------------------------------------------");
         System.out.println( " la diferencia es:");
        c = a.DiferenciaSimetrica(b);
        c.Imprimir();
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("ingrese el dato del conjunto a que quiere conocer:  ");
        a.pertenece(sc.nextInt());
        
        System.out.println("ingrese el dato del conjunto b que quiere conocer:  ");
        b.pertenece(sc.nextInt());
        
        System.out.println("-----------------------------------------------------------------------------");
         System.out.println( " el incluido del conjunto a  es:");
        c = a.incluido(b);
        c.Imprimir();
         System.out.println("-----------------------------------------------------------------------------");
         System.out.println( " el incluido del conjunto b  es:");
        c = b.incluido(a);
        c.Imprimir();
        
        
        
        
       
    }

    // ACA ES LA PARTE DEL CONJUNTO
    public static class Conjunto {

        int items[];
        int tamaño;
        int contador;

        public Conjunto() {
            items = new int[10];
        }

        public Conjunto(int v[]) {
            items = v;
        }

//////////////////////////////////////////////////////////////////
        public void Agregar(int dato) {
            if (Encontrar(dato) == false) {
                items[contador++] = dato;
            } else {
                System.out.println("ya esta el dato en el conjunto");
            }
        }
/////////////////////////////////////////////////////////

        public boolean Encontrar(int dato) {
            boolean encontrado = false;
            for (int i = 0; i < items.length; i++) {
                if (dato == items[i]) {
                    encontrado = true;
                }
            }
            return encontrado;
        }
//////////////////////////////////////////////////////////////////

        public void Imprimir() {
            for (int i = 0; i < contador; i++) {
                System.out.println("datos del conjunto " + items[i]);
            }
        }
/////////////////////////////////////////////////////////////////////////////

        public void InsertarDato(int dato) {
            if (Encontrar(dato) == false) {
                items[contador++] = dato;
            }
        }
/////////////////////////////////////////////////////////////////////////////

        public Conjunto Union(Conjunto datoo) {
            Conjunto R = new Conjunto();
            R.contador = 0;
            for (int i = 0; i < datoo.contador; i++) {
                R.Agregar(datoo.items[i]);
            }
            int i = 0, dato = 0;
            while (true) {
                dato = items[i];
                if (R.Encontrar(dato) == false) {
                    R.Agregar(items[i++]);
                } else {
                    ++i;
                }
                if (i == contador) {
                    break;
                }
            }
            return R;
        }
/////////////////////////////////////////////////////////////////

        public Conjunto Interseccion(Conjunto dat) {
            Conjunto T = new Conjunto();
            T.contador = 0;
            for (int i = 0; i < items.length; i++) {
                if (dat.Encontrar(items[i]) == true) {
                    T.InsertarDato(items[i]);
                }
            }
            return T;
        }
///////////////////////////////////////////////////////////////////

        public Conjunto DiferenciaSimetrica(Conjunto diferencia) {
            Conjunto x = new Conjunto();
            x.contador = 0;
            Conjunto D = new Conjunto();
            D.contador = 0;
            for (int i = 0; i < items.length; i++) {
                x.InsertarDato(items[i]);
            }
            for (int i = 0; i < items.length; i++) {
                if (diferencia.Encontrar(items[i]) == false) {
                    D.InsertarDato(items[i]);
                }
            }
            for (int i = 0; i < diferencia.items.length; i++) {
                if (x.Encontrar(diferencia.items[i]) == false) {
                    D.InsertarDato(diferencia.items[i]);
                }
            }
            return D;
        }

        ////////////////////////////////////////////////
        public boolean pertenece(int dato) {
            boolean f = false;
            if (Encontrar(dato) == true) {
                System.out.println("si pertenece");
                return true;
            } else {
                System.out.println("no pertence");
                f = false;
            }

            return f;
        }

        public Conjunto incluido(Conjunto dato) {
            Conjunto p = new Conjunto();
            p.contador = 0;
            for (int i = 0; i < items.length; i++) {
                if (dato.Encontrar(items[i]) == false) {
                    p.InsertarDato(items[i]);
                }
            }
            return p;

        }

    }
}

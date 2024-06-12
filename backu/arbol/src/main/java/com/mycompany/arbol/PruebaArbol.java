/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbol;

import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */

public class PruebaArbol

{

    public static void main(String args [])

    {

        Arbol arbol = new Arbol();

        int valor;

        String Dato;

        

        System.out.println("Insertando los siguientes valores: ");

        

        Dato = JOptionPane.showInputDialog("Inserta el numero de nodos que desea ingresar");

        int n = Integer.parseInt(Dato);

        

        for(int i = 1; i <= n; i++ )

        {

            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Arbol");

            valor = Integer.parseInt(Dato);

            System.out.print(valor + " ");

            arbol.insertarNodo(valor);

        }

        

        System.out.println("\n\nRecorrido Preorden");

        arbol.recorridoPreorden();

        

        System.out.println("\n\nRecorrido Inorden");

        arbol.recorridoInorden();

        

        System.out.println("\n\nRecorrido Postorden");

        arbol.recorridoPosorden();

    }







public  static  class NodoArbol

{

    //miembros de acceso

    NodoArbol nodoizquierdo;

    int datos;

    NodoArbol nododerecho;

    

    //iniciar dato y hacer de este nodo un nodo hoja

    public NodoArbol(int datosNodo)

    {

        datos = datosNodo;

        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos

    }

    

    //buscar punto de insercion e inserter nodo nuevo

    public synchronized void insertar(int valorInsertar)

    {

        //insertar en subarbol izquierdo

        if(valorInsertar < datos)

        {

            //insertar en subarbol izquierdo

            if(nodoizquierdo == null)

                nodoizquierdo = new NodoArbol(valorInsertar);

            else    //continua recorriendo subarbol izquierdo

                nodoizquierdo.insertar(valorInsertar);

        }

        

        //insertar nodo derecho

        else if(valorInsertar > datos)

        {

            //insertar nuevo nodoArbol

            if(nododerecho == null)

                nododerecho = new NodoArbol(valorInsertar);

            else

                nododerecho.insertar(valorInsertar);

        }

    } // fin del metodo insertar




}
 public static class Arbol

{

    private NodoArbol raiz;

    

    //construir un arbol vacio

    public Arbol()

    {

        raiz = null;

    }

    

    //insertar un nuevo ndo en el arbol de busqueda binaria

    public synchronized void insertarNodo(int valorInsertar)

    {

        if(raiz == null)

            raiz = new NodoArbol(valorInsertar); //crea nodo raiz

        else

            raiz.insertar(valorInsertar); //llama al metodo insertar        

    }

    

    // EMPIEZA EL RECORRIDO EN PREORDEN

    public synchronized void recorridoPreorden()

    {

        ayudantePreorden(raiz);

    }

    //meoto recursivo para recorrido en preorden

    

    private void ayudantePreorden(NodoArbol nodo)

    {

        if(nodo == null)

            return;

        

        System.out.print(nodo.datos + " ");     //mostrar datos del nodo

        ayudantePreorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo

        ayudantePreorden(nodo.nododerecho);     //recorre subarbol derecho

    }

    

    //EMPEZAR RECORRIDO INORDEN

    public synchronized void recorridoInorden()

    {

        ayudanteInorden(raiz);

    }

    

    //meoto recursivo para recorrido inorden

    private void ayudanteInorden( NodoArbol nodo)

    {

        if(nodo == null)

            return;

        

        ayudanteInorden(nodo.nodoizquierdo);

        System.out.print(nodo.datos + " ");

        ayudanteInorden(nodo.nododerecho);

    }

    

    //EMPEZAR RECORRIDO PORORDEN

    public synchronized void recorridoPosorden()

    {

        ayudantePosorden(raiz);        

    }

    

    //meotod recursivo para recorrido posorden

    private void ayudantePosorden(NodoArbol nodo)

    {

        if( nodo == null )

            return;

        

        ayudantePosorden(nodo.nodoizquierdo);

        ayudantePosorden(nodo.nododerecho);

        System.out.print(nodo.datos + " ");

    }

}
 
}

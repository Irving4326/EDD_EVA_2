/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario abArbol = new ArbolBinario();
        abArbol.agregarNodo(new Nodo(35));
        abArbol.agregarNodo(new Nodo(50));
        abArbol.agregarNodo(new Nodo(8));
        abArbol.agregarNodo(new Nodo(12));
        abArbol.agregarNodo(new Nodo(69));
        abArbol.agregarNodo(new Nodo(84));
        abArbol.agregarNodo(new Nodo(25));
        abArbol.agregarNodo(new Nodo(75));
        abArbol.agregarNodo(new Nodo(93));
        abArbol.agregarNodo(new Nodo(16));

        
        //2-10-11-13-16-17-18-20
        System.out.println("Inorden");
        abArbol.imprimirInOrder();
        System.out.println("Pre");
        abArbol.imprimirPre();
        System.out.println("Poz");
        abArbol.imprimirPozole();
    }
    
}

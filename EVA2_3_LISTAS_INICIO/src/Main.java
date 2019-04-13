/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listas lstMiLista = new Listas ();
        
        lstMiLista.agregarNodo(new Nodo (100));
        lstMiLista.agregarNodo(new Nodo (200));
        lstMiLista.agregarNodo(new Nodo (300));
        lstMiLista.agregarNodo(new Nodo (400));
        lstMiLista.agregarNodo(new Nodo (500));
        lstMiLista.agregarNodo(new Nodo (600));
        lstMiLista.agregarNodo(new Nodo (700));
        lstMiLista.agregarNodo(new Nodo (800));
        lstMiLista.agregarNodo(new Nodo (900));
        lstMiLista.agregarNodo(new Nodo (1000)); 
        
        lstMiLista.imprimir();
        lstMiLista.longitud();
        System.out.println("En la lista hay " + lstMiLista.longitud()); 
        
        
    }
        
    
    
          
    }
    


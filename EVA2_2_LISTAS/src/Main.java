
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listas lstMiLista = new Listas ();
        int[] aiDatos = new int [100];
       /* lstMiLista.agregarNodo(new Nodo (100));
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
        System.out.println("En la lista hay " + lstMiLista.longitud()); */
        System.out.println("Eso fue rapido");
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100);
        }
        System.out.println("Toreto?");
        for (int i = 0; i < 100; i++) {
            int iVal = (int)(Math.random() * 100);
            lstMiLista.agregarNodo(new Nodo(iVal));
        }
        
        System.out.println("Valor en posicion 50 = " + lstMiLista.getValor(50));
      
        System.out.println("");
        /* lstMiLista.imprimir();
        lstMiLista.borrarNodo(0);
        lstMiLista.imprimir();
        lstMiLista.agregarNodo(new Nodo (99));
        lstMiLista.imprimir();
        lstMiLista.borrarNodo(9);
        
        */ lstMiLista.imprimir();
         lstMiLista.agregarEn(1, new Nodo(1212));
        lstMiLista.imprimir();
        
        Scanner xd = new Scanner ( System.in);
        System.out.println("Valor a Buscar");
        int iValBus = xd.nextInt();
        xd.nextLine();
        System.out.println("El valor: " +iValBus + "esta en la posicion " +lstMiLista.buscar(iValBus));
        
        Listas lstCopia = lstMiLista.copiaLista();
        lstCopia.imprimir();
        lstCopia.agregarNodo(new Nodo (500));
        lstMiLista.imprimir();
        lstCopia.imprimir();
        System.out.println("");
        lstCopia.inverso();
        System.out.println("Longitud " + lstCopia.longitud());
        System.out.println("");
        
        
        
    }
    
}

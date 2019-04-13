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
        MiStack msPila = new MiStack();
        msPila.push(new Nodo (100));
         msPila.push(new Nodo (200));
          msPila.push(new Nodo (300));
           msPila.push(new Nodo (400));
            msPila.push(new Nodo (500));
            
            System.out.println(" Hay " + msPila.longitud() + " nodos");
             System.out.println(" Valor en la cima " + msPila.peek() );
                           System.out.println(" Valor en la cima " + msPila.pop());
                         
                           
                           msPila.imprimir();
                           System.out.println("");
             
    }
    
}

 // Lista doble
// queue --> lista enlazada     Eva2_6_queue_simple
// queue, stack ---> Lista doblemente enlazada   //Eva2_7_QUEUE_STACK_DOUBLE



//por herencia
//agregar stack
// push, peek , pop
//agregar queue
// add --> agregar nodo al final 
//get --> Leer nodo al inicio
// getRemove  -->  leer nodo al inicio y eliminarlo
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        queue Yoloman = new queue();
        Yoloman.AgregarNodoqueue(new NodoQue(1));
        Yoloman.AgregarNodoqueue(new NodoQue(2));
        Yoloman.AgregarNodoqueue(new NodoQue(3));
        Yoloman.AgregarNodoqueue(new NodoQue(4));
        Yoloman.AgregarNodoqueue(new NodoQue(5));
        Yoloman.AgregarNodoqueue(new NodoQue(6));
        Yoloman.AgregarNodoqueue(new NodoQue(7));
        Yoloman.AgregarNodoqueue(new NodoQue(8));
        Yoloman.AgregarNodoqueue(new NodoQue(9));
        Yoloman.AgregarNodoqueue(new NodoQue(10));
        
        System.out.println("Hay" + Yoloman.longitud() + " elementos en la cola");
        Yoloman.imprimirqueue();
        
        System.out.println("Valor de la cima: " + Yoloman.get());
        
        System.out.println("Eliminaremos el primero de la cola");
        Yoloman.getRemove();
       
        
        Yoloman.imprimirqueue();
        System.out.println("Valor de la cima: " + Yoloman.get());
    }    
}

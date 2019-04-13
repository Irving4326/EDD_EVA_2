
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Lista yoloman = new Lista();
        Scanner xd = new Scanner (System.in);
       int x=0;
       int r=0;
        do{
            System.out.println("Dame un valor");
            r = xd.nextInt();
            xd.nextLine();
            yoloman.agreNo(new Nodo(r));
            System.out.println("Quieres dejar de ingresar valores ?  1.- si ");
            x=xd.nextInt();
            xd.nextLine();
            
        }while(x !=1);
                
                
       

        System.out.println("Fila / Queue");
              System.out.println("");
        
        System.out.println("Hay " + yoloman.longitud() + " nodos");
             yoloman.imprimir();
             System.out.println("");
             
             
        System.out.println("Valor hasta arriba : " + yoloman.get());
        System.out.println("Quitaremos: " + yoloman.getRemove());
        yoloman.imprimir();
        
        
        System.out.println("");
        System.out.println("Pila");
        
        //Agregamos mas nodos para comprobar si se siguen acumulando :D
        // yoloman.deleteNodo(r);   ---> Reiniciamos para que comienze desde 0
        
        yoloman.agreNo(new Nodo(10));
           yoloman.agreNo(new Nodo(71));
             yoloman.agreNo(new Nodo(12));
                yoloman.agreNo(new Nodo(4215));
        
        
        System.out.println("Existen " + yoloman.longitud() + " nodos");
        yoloman.imprimir();
        
        System.out.println("");
        
        System.out.println("Valor hasta arribita: " + yoloman.peek());
        System.out.println("Quitamos: " + yoloman.pop());
        yoloman.imprimir();
        
        
        System.out.println("Ahora el valor es: " + yoloman.peek());
     
    }
}

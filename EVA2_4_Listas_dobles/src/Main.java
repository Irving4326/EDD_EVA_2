
import java.util.Scanner;

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
        ListaDoble lstLista = new ListaDoble ();
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 100);
            lstLista.agregarNodo(new Nodo (iVal));
        }
        System.out.println("hay " +lstLista.longitud() );
        System.out.println("Creamos una copia de seguridad");
         ListaDoble  lstCopia = lstLista.copiaLista();
         System.out.println("");
        System.out.print("Origonal:");
        lstLista.imprimir();
        System.out.print("Inverso:");
        lstLista.imprimirOrdenInverso();
        Scanner sInput = new Scanner ( System.in);
        
        System.out.println("Valora buscar: ");
        int iVal = sInput.nextInt();
        sInput.nextLine();
        System.out.println("La posiciòn es: " +lstLista.buscar(iVal));
        
        
        
        lstLista.agregarInicio(new Nodo (999));
       lstLista.imprimir();
              
        System.out.println("Valor a eliminar: ");
         iVal = sInput.nextInt();
        sInput.nextLine();
        lstLista.borrarNodo(iVal);
        lstLista.imprimir();
        
        
        System.out.println("");
        
        System.out.println("Imprimimos la copia de seguridad");    
         lstCopia.imprimir();
         
          System.out.println("Imprimimos el modificado");
         lstLista.imprimir();
         
            lstLista.agregarEn(2, new Nodo(24));
         lstLista.imprimir();
      
    }
    
}

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
        Nodo nObj1 = new Nodo ();
        nObj1.iVal= 100;
        nObj1.nSig= null;
        
        Nodo nObj2 = new Nodo();
        nObj2.iVal= 200;
        nObj2.nSig=null;
        
        Nodo nObj3 = new Nodo();
        nObj3.iVal = 300;
        nObj3.nSig= null;
        
        //Vincular los nodos y crear una lista 
        nObj1.nSig = nObj2;
        nObj2.nSig = nObj3;  
        
        
        Nodo nTemp = nObj1;
        while(nTemp != null){
            System.out.println("iVal = " + nTemp.iVal);
            nTemp = nTemp.nSig;
        
        }
        
    }
    
}
//Este es el "Eslabon" en nuestra cadena
class Nodo{
//Datos a almacenar
    public int iVal;
    
//Referencia para crear la cadena
    //Puede haber multiples referencias
    public Nodo nSig;
    
    
}

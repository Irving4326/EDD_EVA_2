/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class queue {
    private NodoQue inicio;
    private NodoQue fin;
    private int cont;
    
    
    public queue(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public void AgregarNodoqueue(NodoQue nNuevo){
        if(inicio == null){
            inicio = nNuevo;
            
            fin = nNuevo;
        }else{
            fin.setSig(nNuevo);
            fin = nNuevo;
        }
        cont++;
    }
    
    public void imprimirqueue(){
        NodoQue nTemp = inicio;
        while(nTemp != null){
            System.out.print("[" + nTemp.getDato()+ "]");
            nTemp = nTemp.getSig();
        }
        System.out.println("");
    }
    
    public int getRemove(){
        int ele = inicio.getDato();
        inicio = inicio.getSig();
        cont--;
        return ele;
    }
    
    public int  get(){
        return inicio.getDato();
    }
    
    public int longitud(){
        return cont;
    }
}

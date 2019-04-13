/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class ListaDoble {
    public Nodo inicio;
    public Nodo fin;
    public int Con;

    public ListaDoble() {
        inicio = null;
        fin = null;
        Con = 0;
    }
    
  public void push(Nodo nNuevo){
        agreFin(nNuevo);
    }
  
    public int peek(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
        }else{
            //NOTIFICAR QUE NO HAY NODOS
        }
        return iResu;
    }
    
    public int pop(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
            //REMOVER EL NODO INICIAL
            deleteNodo(0);
        }else{
            //NOTIFICAR QUE NO HAY NODOS
        }
        return iResu;
    }
    
    public int buscar(int iVal){
        int iPos = -1;
        int iCont = 0;
        Nodo nTemp = inicio;
        while(nTemp != null){
            if(iVal == nTemp.getValor()){
                iPos = iCont + 1;
                break;
            }
            iCont++;
            nTemp = nTemp.getSig();
        }
        return iPos;
    }
    public int longitud(){
        return Con;
    }
    
    
    
    
    
    public void deleteNodo(int iPos){

        if(inicio != null){
            if(iPos == 0){
               
                inicio = inicio.getSig();
                if(inicio.getSig() == null){
                    fin = null;
                    Con--;
                }
            }else{
                Nodo nTemp = inicio;
                int iCont = 0;
                while(iCont != iPos-1){
                    nTemp = nTemp.getSig();
                    iCont++;
                }
                Nodo nSig = nTemp.getSig();
                nTemp.setSig(nSig.getSig());
                //EL PROBLEMA ES EL NODO FIN
                nTemp.setPrevio(nSig.getPrevio());
                if(nTemp.getSig() == null){
                    fin = nTemp;
                    Con--;
                }
            }
        }else{
            
        }
    }
    
    
    
    
    //EFICIENCIA O(N)
    public int getValor(int iPos){
        int iVal = 0;
        int iCont = 0;
        //LLEVAR AL FINAL DE LA LISTA.
        Nodo nTemp = inicio;
        while(nTemp != null){
            if(iCont == iPos){
                iVal = nTemp.getValor();
                break;
            }
            nTemp = nTemp.getSig();
            iCont++;
        }
        return iVal;
    }
    
    public void imprimir(){
        
        Nodo nTemp = inicio;
        while(nTemp != null){
            System.out.print("[" + nTemp.getValor() + "]");
            nTemp = nTemp.getSig();
        }
        System.out.println("");
    }
    //EFICIENCIA O(N)
    
    public void imprimirOrdenInverso(){
        Nodo nTemp = fin;
        while(nTemp != null){
            System.out.print("[" + nTemp.getValor() + "]");
            nTemp = nTemp.getPrevio();
        }
        System.out.println("");
    }
    
    public void vaciar(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    //EFICIENCIA O(N)
    
    public ListaDoble copiaLista(){
        ListaDoble lsCopia = new ListaDoble();
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA ELEMENTO,
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
        while(nTemp != null){
            lsCopia.agreNo(new Nodo(nTemp.getValor()));
            nTemp = nTemp.getSig();
        }
        return lsCopia;
    }
    
    public int getRemove(){
        int ele = inicio.getValor();
        inicio = inicio.getSig();
        Con--;
        return ele;
    }
    
    public int get(){
        return inicio.getValor();
    }
    
    
      public void agreFin(Nodo nNuevo){
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo;
            Con++;
        }else{
            nNuevo.setPrevio(fin);
            inicio.setSig(nNuevo);
            fin = nNuevo;
            Con++;
        }
    }
      
    public void agreNo(Nodo nNuevo){
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo;
            Con++;
        }else{
            fin.setSig(nNuevo);
            nNuevo.setPrevio(fin);
            fin = nNuevo;
            Con++;
        }
    }
    
}

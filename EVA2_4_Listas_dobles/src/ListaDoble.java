/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int iContNodo;

    public ListaDoble() {
     inicio= null;
     fin= null;
     iContNodo= 0;
    }
          public void agregarInicio(Nodo nNuevo){

    //Verificar el estado de la lista:
        //Esta vacia?
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;
       iContNodo++;
        }else{//Lista con un nodo
            nNuevo.setSiguienete(inicio);//Lo ponemos al incipio
            inicio.setPrevio(nNuevo);
            inicio= nNuevo;
           iContNodo++;
        }      
}
 //O(N)
    public void imprimir(){
     Nodo nTemp = inicio;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
               System.out.print("[" + nTemp.getValor()  + "]");
                nTemp = nTemp.getSiguienete();
            }
            System.out.println("");
    }
    
          //Eficiencia O(N)
     public void imprimirOrdenInverso(){
     Nodo nTemp = fin;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
               System.out.print("[" + nTemp.getValor()  + "]");
                nTemp = nTemp.getPrevio();
            }
            System.out.println("");
    }
     
    public void agregarNodo (Nodo nNuevo ){
    //lISTA VACIA
        if( inicio == null){
        inicio = nNuevo;
        fin = nNuevo;
        iContNodo++;
        }else{ //Hay elementos
        //Conectar al final 
            fin.setSiguienete(nNuevo);
            nNuevo.setPrevio(fin);
            fin = nNuevo;
            iContNodo++;
        }
    
    }
    
    //Construct a copy
    public ListaDoble copiaLista(){
    ListaDoble lsCopia = new ListaDoble();
    //Hay que recorrer toda la lista; ller cada nodo
    //Crear un nodo nuevo para ese valor
    //Insertarlo en la nueva linea
    Nodo nTemp = inicio;
    while(nTemp != null){ 
                lsCopia.agregarNodo(new Nodo(nTemp.getValor()));
                System.out.print("[" + nTemp.getValor()  + "]");
                nTemp = nTemp.getSiguienete();
            }
     
    return lsCopia;
    
    }
    
    
    //
    
      
      public void agregarEn(int iPos, Nodo nNuevo){
          
          //Debe haber nodos, por tanto, Ipos deve estar en el rango de 0 --> N - 1
          
              
          
           if(inicio ==null){  //Lista vacia
               System.out.println("La lista esta vacia");
             
               
           }else{  
               
           Nodo nTemp= inicio;
           int iCont=0;
           while(iCont !=  iPos ){
               iCont++;
        nTemp = nTemp.getSiguienete();
        
        
        }
           nNuevo.setSiguienete(nTemp);
           nTemp.getPrevio().setSiguienete(nNuevo);
           nNuevo.setPrevio(nTemp.getPrevio());
           nTemp.setPrevio(nNuevo);
           iContNodo++;
           
           //El problema es el nodo fin
           if(nTemp.getSiguienete()== null){//borramos el ultimo nodo
           fin = nTemp;
         
           }
           iCont++;   
       }      
      
      }
      
      
       public boolean estaVacia(){
    if (inicio == null){
    return true;
    }
    return false;
    }
       
        public void vaciar(){
     
         inicio = null;
         fin= null;
     }
        
        public int buscar (int iVal){
    int iPos = 1;
    //Como buscamos el valor
    //Recorer elementos por elementos
     
    
    //detener la busqueda cuando lo encontramos
    //Se puede llegar al final de la lista sin encontrarlo
    Nodo nTemp = inicio;
    int iCont =0;
        while(nTemp != null){
        if(iVal == nTemp.getValor()){
              iPos = iCont;
              break;
            }
                  iCont++;
                  nTemp = nTemp.getSiguienete();
    }
    return iPos;
    }
       
     public int longitud(){
     return iContNodo++;
     }
     
     
     
     
     
     
     public void borrarNodo(int ipos){
    //Borrar al inicio de la lista
        //Borrar cualquier posicion
        //Verificar que haya nodos
        //Verificar que la posicion sea vàlida
        if(inicio != null){//Tener nodos
        if(ipos == 0){//Nodo inicial
            //Hay un Nodo
            //Hay nNODOS
        inicio = inicio.getSiguienete();
        //El problema es el nodo fin
        if(inicio.getSiguienete() == null){
        fin = null;
        iContNodo--;
        }
        //El problema es el nodo fin
        }else{//Cualquier otro nodo
              //Movernos por la lista
              //En una lista simple (un solo enlace implica movernos hasta la posicion previa -1
           Nodo nTemp= inicio; //Esto nunca cambia 
           // nTemp--> --> nodo a borrar --> nodo sig
           //              fin
           int iCont=0;
           while(iCont != ( ipos -1)){
               iCont++;
        nTemp = nTemp.getSiguienete();
        }
           Nodo nSig = nTemp.getSiguienete();
           nTemp.setSiguienete(nTemp.getSiguienete().getSiguienete());
           nTemp.setPrevio(nSig.getPrevio());
           //El problema es el nodo fin
           if(nTemp.getSiguienete()== null){//borramos el ultimo nodo
           fin = nTemp;
           iContNodo--;
           }
           iCont--;
        }
        }else{//Generar una excepciòn --> Lista vacia
            System.out.println("No hay nodos :c");
        }
     }
     
     
      
     
}


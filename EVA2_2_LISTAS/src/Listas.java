/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Listas {
    //Inicio de la lista
    private Nodo inicio;
    private Nodo fin;
    private int iCont = 0;
    
    //Al crear la lista, inicia con 0 elementos
    //Lista vacia:
    //3 estados: Vacia, con un nodo, con N nodos
    public Listas() {
        inicio = null;
        fin = null;
    }
    //Primer mètodo: agregar un nodo
    //Metodo que reciba un nodo
    //Eficiencia --> O(N)
    //Nueva eficiencia --> O(1)
    public void agregarNodo(Nodo nNuevo){
    //Verificar el estado de la lista:
        //Esta vacia?
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;
        fin = nNuevo;  //Modificado -->Mayor eficiencia
        }else{//Lista con un nodo
        //Lista con N nodos
            
            //LLevar al final
          /*  Nodo nTemp = inicio;
            while(nTemp.getSig() != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
            nTemp = nTemp.getSig();
            
            }
            //Conectamos nTemp.sig --> nuevo
            nTemp.setSig(nNuevo);*/
            iCont++;
        }
    
        fin.setSig(nNuevo);
        fin = nNuevo;
        
    }
    //O(N)
    public void agregarInicio(Nodo nNuevo){

    //Verificar el estado de la lista:
        //Esta vacia?
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;
        fin = nNuevo;  //Modificado --> Mayor eficiencia
        }else{//Lista con un nodo
            nNuevo.setSig((inicio));//Lo ponemos al incipio
            inicio= nNuevo;
        }      
}
    
    //Eficiencia O(N)
    public void agregarEn(int iPos, Nodo nNuevo){
    
          
          //Debe haber nodos, por tanto, Ipos deve estar en el rango de 0 --> N - 1
          
              
          
           if(inicio ==null){  //Lista vacia
               System.out.println("La lista esta vacia");
             
               
           }else{  
               
           Nodo nTemp= inicio;
           int iCont=0;
           while(iCont !=  iPos ){
               iCont++;
        nTemp = nTemp.getSig();
       
        }
           nNuevo.setSig(nTemp.getSig());
           nTemp.setSig(nNuevo);
          
           iCont++;
           
           //El problema es el nodo fin
           if(nTemp.getSig()== null){//borramos el ultimo nodo
           fin = nTemp;
         
           }
           iCont++;   
       }      
    }
    //O(1)
    public boolean estaVacia(){
    if (inicio == null){
    return true;
    }
    return false;
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
        if(iVal == nTemp.getDato()){
              iPos = iCont;
              break;
            }
                  iCont++;
                  nTemp = nTemp.getSig();
    }
    
    return iPos;
    
    }
    //O(n)
    public Listas copiaLista(){
    Listas lsCopia = new Listas();
    //Hay que recorrer toda la lista; ller cada nodo
    //Crear un nodo nuevo para ese valor
    //Insertarlo en la nueva linea
    Nodo nTemp = inicio;
    while(nTemp != null){ 
                lsCopia.agregarNodo(new Nodo(nTemp.getDato()));
                System.out.print("[" + nTemp.getDato()  + "]");
                nTemp = nTemp.getSig();
            }
     
    return lsCopia;
    
    }
    //Eficiencia O(N^2)
    public void inverso(){
    int cont = longitud()-1;
         for (int i = cont -1; i >= 0; i--) {
             System.out.print("[" +getValor(i) + "]");
           
        }
           
            
            System.out.println("");
        
    }
    
    //Eficiencia O(N)
    public void borrarNodo(int ipos){
    //Borrar al inicio de la lista
        //Borrar cualquier posicion
        //Verificar que haya nodos
        //Verificar que la posicion sea vàlida
        if(inicio != null){//Tener nodos
        if(ipos == 0){//Nodo inicial
            //Hay un Nodo
            //Hay nNODOS
        inicio = inicio.getSig();
        //El problema es el nodo fin
        if(inicio.getSig() == null){
        fin = null;
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
        nTemp = nTemp.getSig();
        }
           Nodo nSig = nTemp.getSig();
           nTemp.setSig(nTemp.getSig().getSig());
           //El problema es el nodo fin
           if(nTemp.getSig() == null){//borramos el ultimonodo
           fin = nTemp;
           }
           iCont--;
        }
        }else{//Generar una excepciòn --> Lista vacia
        
        }
        
        
    }
    //O(N)
    public void imprimir(){
     Nodo nTemp = inicio;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
               System.out.print("[" + nTemp.getDato()  + "]");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }
    //O(N)
    public int longitud(){
     
             
    /*Nodo nTemp = inicio;
    int con =0;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
                con++;
                nTemp = nTemp.getSig();
                
            }*/
            return iCont++;
    }
    //O(1)
    public void vaciar(){
    inicio = null;
    fin = null;
    
            }
    //Listas manejan indice como arreglos
    //Primer Nodo --> 0 
    //Ultimo Nodo --> N - 1
    
    //Eficiencia O(N)
    
    // Agregar:
    //Lista vacia
    //Parametro incorrecto (iPos no este entre 0 y N-1)
    //Excepciones--> Throw 
    //O(N)
    
    public int getValor(int iPos){
        int iVal = 0;
        int iCont =0;
     Nodo nTemp = inicio;
            while(nTemp != null){ 
                if(iCont == iPos){
                iVal = nTemp.getDato();
                break;
                }
                nTemp = nTemp.getSig();
                iCont++;
                
            }
            
          return iVal;
    }
  
    
}

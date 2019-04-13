/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class MiStack {
     //Inicio de la lista
    private Nodo inicio;
    private Nodo fin;
    private int iCont ;
    
    //Al crear la lista, inicia con 0 elementos
    //Lista vacia:
    //3 estados: Vacia, con un nodo, con N nodos
    public MiStack() {
        inicio = null;
        fin = null;
        iCont = 0;
    }
       public int longitud(){  
        return iCont++;
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
    
        fin.setSiguienete(nNuevo);
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
            nNuevo.setSiguienete((inicio));//Lo ponemos al incipio
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
        nTemp = nTemp.getSiguienete();
        
        
        }
           nNuevo.setSiguienete(nTemp);
           nTemp.getPrevio().setSiguienete(nNuevo);
           nNuevo.setPrevio(nTemp.getPrevio());
           nTemp.setPrevio(nNuevo);
           iCont++;
           
           //El problema es el nodo fin
           if(nTemp.getSiguienete()== null){//borramos el ultimo nodo
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
        if(iVal == nTemp.getValor()){
              iPos = iCont;
              break;
            }
                  iCont++;
                  nTemp = nTemp.getSiguienete();
    }
    
    return iPos;
    
    }
    //O(n)
    public MiStack copiaLista(){
    MiStack lsCopia = new MiStack();
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
        inicio = inicio.getSiguienete();
        //El problema es el nodo fin
        if(inicio.getSiguienete() == null){
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
        nTemp = nTemp.getSiguienete();
        }
           Nodo nSig = nTemp.getSiguienete();
           nTemp.setSiguienete(nTemp.getSiguienete().getSiguienete());
           //El problema es el nodo fin
           if(nTemp.getSiguienete() == null){//borramos el ultimonodo
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
               System.out.print("[" + nTemp.getValor()+ "]");
                nTemp = nTemp.getSiguienete();
            }
            System.out.println("");
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
                iVal = nTemp.getValor();
                break;
                }
                nTemp = nTemp.getSiguienete();
                iCont++;
                
            }
            
          return iVal;
    }
  
    public void push(Nodo nNuevi){
        agregarInicio(nNuevi);
    }
   
    public int peek(){
    int iResu =0;
    if( inicio !=null){
    
    iResu = inicio.getValor();
    }else{
        
        //Notificar que no hay nodos
    }
        return iResu;
    
    
    }
    public int pop(){
    int iResu = 0;
    if( inicio !=null){
    
    iResu = inicio.getValor();
    //Remover el nodo inicial
        borrarNodo(0);
    }else{
        
        //Notificar que no hay nodos
    }
    return iResu;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ArbolBinario {
    
    private Nodo root;

    public ArbolBinario() {
        root = null;
    }
    
    public void agregarNodo(Nodo nNuevo){
    
        if(root == null){ //Arbol vacio, se inserta
        root = nNuevo;
        }else{//Proceso recursivo
            agregarRecursivo(root, nNuevo);
        }
    }
       //Nodo Acutal, Valor a insertar
    private void agregarRecursivo(Nodo nActual, Nodo nNuevo){
        //Izquierda
    if(nNuevo.getValor() < nActual.getValor()){
        //Posicion ocupada, seguimos avanzando
    if(nActual.getIzq() != null){
        agregarRecursivo(nActual.getIzq(), nNuevo);
    }else{
    nActual.setIzq(nNuevo);
    }
        
    }else if(nNuevo.getValor() > nActual.getValor()){  //Derecha
        
    if(nActual.getDer()!= null){
        agregarRecursivo(nActual.getDer(), nNuevo);
    }else{
    nActual.setDer(nNuevo);
    }
        
    }else{ //Igual --> Mensaje al usuario
        //Mensaje al usuario
        System.out.println("El valor ya esta");
    }
    }
    public void imprimirInOrder(){
        inOrder(root);
    }
        public void imprimirPre(){
            Preorden(root);
        }
        
    public void imprimirPozole(){
        Pozole(root);
    }

           
    private void inOrder(Nodo nActual){
    /*
        Recorrer Izquierda
        leer el valor
        Recorrer derecha
      
        */
        if(nActual != null){
        inOrder(nActual.getIzq());
            System.out.println("[" +nActual.getValor() + "]");
            inOrder(nActual.getDer());
        }
        
    }
    //Preorden
    //raíz, izquierdo, derecho
        private void Preorden(Nodo nActual){
                    if(nActual == null){
                    return;

                    }
                    System.out.println("[" +nActual.getValor() + "]");
                    Preorden(nActual.getIzq());
                    Preorden(nActual.getDer());
        }
        
         //Posorden
    //izquierdo, derecho, raíz
    private void Pozole(Nodo nActual){
        if(nActual != null){
            Pozole(nActual.getIzq());
            Pozole(nActual.getDer());
           System.out.println("[" +nActual.getValor() + "]");

        }
        
    }
    
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Listas {
    
    //Inicio de la lista
    private Nodo inicio;
    //Al crear la lista, inicia con 0 elementos
    //Lista vacia:
    //3 estados: Vacia, con un nodo, con N nodos
    public Listas() {
        inicio = null;
    }
    //Primer mètodo: agregar un nodo
    //Metodo que reciba un nodo
    //Eficiencia --> O(1)
    public void agregarNodo(Nodo nNuevo){
    //Verificar el estado de la lista:
        //Esta vacia?
        
        //Agregamos un nodo al principio de la lista
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;;
        }else{//Lista con un nodo
        //Lista con N nodos  
       nNuevo.setSig(inicio);
        inicio = nNuevo;
    }
        
    }
    
    
    public void imprimir(){
     Nodo nTemp = inicio;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
                System.out.println("" + nTemp.getDato()  + "}");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }
    
    public int longitud(){
    Nodo nTemp = inicio;
    int con =0;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
                con++;
                nTemp = nTemp.getSig();
                
            }
            return con;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Nodo {
    
    private int valor;
    private Nodo siguienete;
    private Nodo previo;

    public Nodo() {
     siguienete = null;
     previo= null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        siguienete = null;
       previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguienete() {
        return siguienete;
    }

    public void setSiguienete(Nodo siguienete) {
        this.siguienete = siguienete;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
}

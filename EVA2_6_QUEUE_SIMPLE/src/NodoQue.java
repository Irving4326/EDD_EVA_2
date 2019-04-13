/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class NodoQue {
  
    private int dato;
    
    private NodoQue sig;

    public NodoQue() {
        this.sig = null;
    }

    public NodoQue(int dato) {
        this.dato = dato;
        this.sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoQue getSig() {
        return sig;
    }

    public void setSig(NodoQue sig) {
        this.sig = sig;
    }
}

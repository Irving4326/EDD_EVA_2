
import java.awt.Point;

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
    
    //Atributos datos
    private Point dato;
    private Point dato2;
    //Atributo para crear la lista (Referencias)
    private Nodo sig;

    public Nodo() {
        sig=null;     
    }

    
    public Nodo(Point dato) {
        this.dato = dato;
        sig=null;
    }


    
    
    

    public Point getDato() {
        return dato;
    } 
    public void setDato(Point dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    Point setDato(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

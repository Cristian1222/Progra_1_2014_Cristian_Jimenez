/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

/**
 *
 * @author Cristian J
 */
public class ClsNododeLista {

    
    private String dato;
    private ClsNododeLista siguiente;
    
    public ClsNododeLista()
    {   
    dato="";
    siguiente=null;
    }
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public ClsNododeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ClsNododeLista siguiente) {
        this.siguiente = siguiente;
    }
    
}

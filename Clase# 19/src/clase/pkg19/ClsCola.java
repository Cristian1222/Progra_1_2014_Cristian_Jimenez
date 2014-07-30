/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Cristian J
 */
public class ClsCola {

    private ClsNododeLista raiz;
    private ClsNododeLista ultimo;

    public ClsCola() {

        raiz = null;
    }

    boolean Vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;

        }
    }

    public void Encolar(String dato) {
        ClsNododeLista nuevo;
        nuevo = new ClsNododeLista();
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if (Vacia()) {
            ultimo = nuevo;
            raiz = nuevo;
        } else {

            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }


    }

    public Object Desencolar() {
        if (!Vacia()) {
            Object dato = raiz.getDato();
            if (raiz == ultimo) {
                raiz = null;
                ultimo = null;

            } else {
                raiz = raiz.getSiguiente();
            }

            return dato;

        }
        return new Object();
    }
    public void Imprimir() {
        ClsNododeLista recorrido=raiz;
        System.out.println("Listado de  todos los elementos de la Cola");
        
        while(recorrido!=null){
            
            System.out.println(recorrido.getDato()+ "-");
            recorrido=recorrido.getSiguiente();
            
        
        }
        System.out.println();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Cristian J
 */
public class ClsPila {
    
    private ClsNododeLista raiz;

    public ClsPila() 
    {

        raiz = null;
    }
    
    public void Push(String dato){
    
    ClsNododeLista nuevo;
    nuevo= new ClsNododeLista();
    nuevo.setDato(dato);
        if (raiz==null) {
            nuevo.setSiguiente(null);
            raiz=nuevo; 
        }else{
        
        nuevo.setSiguiente(raiz);
        raiz=nuevo;
        }
    }
    public Object Pop(){
        if (raiz!=null) {
            Object info=raiz.getDato();
            raiz=raiz.getSiguiente();
            return info;
            
        }
    return new Object();
    }
    public void Imprimir() {
        ClsNododeLista recorrido=raiz;
        System.out.println("Listado de  todos los elementos de la Pila");
        
        while(recorrido!=null){
            
            System.out.println(recorrido.getDato()+ "-");
            recorrido=recorrido.getSiguiente();
            
        
        }
        System.out.println();
    }
    
    public boolean Vacia(){
        if (raiz==null) {
            return true;
            
        }else{
        return false;
        }
    }
    
    public int Cantidad(){
    int cantidad=0;
    ClsNododeLista recorrido=raiz;
    while(recorrido!=null){
    cantidad++;
    recorrido=recorrido.getSiguiente();
    
    }
    return cantidad;
    
    }
}

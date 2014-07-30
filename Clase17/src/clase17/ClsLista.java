/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

/**
 *
 * @author Cristian J
 */
public class ClsLista {

    private ClsNododeLista raiz;
    
  
    public ClsLista() {
      
        raiz = null;
    }

    public void Insertar(String dato) {
        ClsNododeLista nuevo;

        nuevo = new ClsNododeLista();
        nuevo.setDato(dato);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;

        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void Imprimir() {
        ClsNododeLista recorrido = raiz;
        System.out.println("Listado de  todos los elementos de la Lista");

        while (recorrido != null) {

            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();


        }
        System.out.println();


    }

    public String EliminarInicio() {
        ClsNododeLista nuevo;

        nuevo = new ClsNododeLista();
        try {
            String dato = raiz.getDato();
            raiz = raiz.getSiguiente();
            if (raiz == null) {
                raiz = nuevo;
            }
            return dato;

        } catch (Exception e) {
            return null;
        }
    }

    public String EliminarUltimo() {
        String dato;
        ClsNododeLista nuevo;
        nuevo = new ClsNododeLista();
        
        ClsNododeLista pivot =raiz;
        
        try{ if(pivot.getSiguiente()!=null){
            while(pivot.getSiguiente()!= nuevo){
                pivot=pivot.getSiguiente();
            }
            pivot.setSiguiente(null);
                
        }else{
            pivot= null;
            raiz=pivot;
        }dato=nuevo.getDato();
        nuevo=pivot;
       
        return dato;
        
        }catch(Exception e){return null;
        
        }
       
    }
}

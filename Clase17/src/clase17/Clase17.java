/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

/**
 *
 * @author Cristian J
 */
public class Clase17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ClsLista L=new ClsLista();
       L.Insertar("Efren");
       L.Insertar("Joss");
       L.Insertar("Navas");
       L.EliminarInicio();
       L.EliminarUltimo();
       L.Imprimir();
    }
}

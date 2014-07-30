/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Cristian J
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  ClsPila P =new ClsPila();
        P.Push("Efren");
        P.Push("Joss");
        P.Push("Andrey");
        P.Push("Jose");
        P.Imprimir();
        System.out.println("La cantidad de elementos es:  " + P.Cantidad());
        if (!P.Vacia()) {
                    System.out.println("La pila no esta vacia");  }
        else{
        System.out.println("La pila esta vacia"); }
        P.Pop();
        P.Pop();
        P.Imprimir();*/
        
       ClsCola C = new ClsCola();
       C.Encolar("Efren");
       C.Encolar("Joss");
       C.Encolar("Andrey");
       C.Encolar("Jose");
       C.Imprimir();
       C.Desencolar();
       C.Imprimir();
        
    }
}

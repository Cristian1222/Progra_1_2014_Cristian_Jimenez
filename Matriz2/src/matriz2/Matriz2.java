/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int f,c;
     
     Scanner teclado = new Scanner(System.in);
     ClsMetodos_Realizar M = new ClsMetodos_Realizar();
     
     System.out.println("Digite el Largo deseado");
     f = teclado.nextInt();
     System.out.println("Digite el Ancho deseado ");
     c= teclado.nextInt();
     
     
    }
}

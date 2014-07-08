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
public class ClsMetodos_Realizar {

    private Scanner teclado;
    private int[][] Promedio;
    
    public void cargar(int f, int c){
    
        teclado = new Scanner(System.in);
        Promedio = new int[f][c];
        
        for (int i = 0; i <f; i++) {
            for (int o = 0; o < c; o++) {
                System.out.println("Digite el valor deseado");
                Promedio[i][o]= teclado.nextInt();
                
            }
            
        }
    }
    
    public void Imprimir(int f,int c){
    
    for (int i = 0; i <f; i++) {
            for (int o = 0; o < c; o++) {
                System.out.println(Promedio[i][o] +" ");
                
    }
            System.out.println();
    }
    }
}

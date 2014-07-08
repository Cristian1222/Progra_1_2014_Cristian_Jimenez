/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class clsEjercicio2 {

    private int[][] matriz;
    private Scanner teclado;

    public void CargarMatriz() {

        teclado = new Scanner(System.in);
        matriz = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }
    
    public void ImprimirDiagonal(){
    
        for (int f = 0; f < 4; f++) {
            for (int i = 0; i < 4; i++) {
                
                if(i==f){
                System.out.print(matriz[f][f] + " ");
                }
                else{
                System.out.print("_"+" ");
                }
            }
            
            System.out.println();
        }
    
    }
}

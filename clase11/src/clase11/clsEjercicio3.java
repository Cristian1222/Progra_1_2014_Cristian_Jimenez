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
public class clsEjercicio3 {

    private int[][] matriz;
    private Scanner teclado;

    public void CargarMatriz() {

        teclado = new Scanner(System.in);
        matriz = new int[3][4];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public void ImprimirPrimerFila() {

        System.out.println("Primer fila de la matriz");
        for (int f = 0; f < 4; f++) {
            System.out.println(matriz[0][f]);

        }
    }
    
    public void UltimaFila(){
        System.out.println("Ultima fila de la matriz");
    
        for (int f = 0; f < 4; f++) {
            System.out.println(matriz[2][f]);
    
        }
    }
    public void PrimerColunma(){
    
        System.out.println("Primer columna de matriz ");
        for (int f = 0; f < 3; f++) {
            System.out.println(matriz[f][0]);
        }
    }
}

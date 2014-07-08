/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Clase15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        char C = ' ';
        String Ordenamiento= "A";

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la operacion a realizar" + "\n");
            System.out.println("1.OrdenamientoSeleccion"+"\n");
             System.out.println("2.OrdenamientoBurbuja"+"\n");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    int[] arreglo = {56, 4, 85, 85, 42};
                    int[] arregloOrdenado;
                    Ordenamiento=teclado.nextLine();
                    ClsOrdenamientoSeleccion os = new ClsOrdenamientoSeleccion();
                    arregloOrdenado = os.OrdenS(arreglo, Ordenamiento);
                    for (int i = 0; i
                            < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);

                    }
                    break;
                case 2:
                    int[] arreglo1 = {7, 15, 9, 26, 27, 30};
                    int[] arregloOrdenadoB;
                    Ordenamiento = teclado.nextLine();
                    ClsOrdenamientoBurbuja oB = new ClsOrdenamientoBurbuja();
                    arregloOrdenadoB = oB.OrdenamientoB(arreglo1, Ordenamiento);
                    for (int i = 0; i < arregloOrdenadoB.length; i++) {
                        System.out.println(arregloOrdenadoB[i]);

                    }
                    break;

                default:

                    break;
            }
        } while ((C == 's') || (C == 'S'));
    }
}

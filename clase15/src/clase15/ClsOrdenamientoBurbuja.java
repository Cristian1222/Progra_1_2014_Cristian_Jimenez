/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author profe
 */
public class ClsOrdenamientoBurbuja {

    public int[] OrdenamientoB(int[] arreglo, String ordenamiento) {

        int indice = 0, indice2 = 0, auxiliar = 0;

        if (ordenamiento.equals("a")||ordenamiento.equals("A")) {
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                    if (arreglo[indice2 + 1] < arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;

                    }

                }

            }

        } else { 
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                    if (arreglo[indice2 + 1] > arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }
            }
        }return arreglo;
    }
    }


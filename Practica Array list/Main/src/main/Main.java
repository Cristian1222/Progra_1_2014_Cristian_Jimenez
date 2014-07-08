/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char c = 's';
        int vecs = 0;
        int vec = 0;
        int vecsa = 0;
        int vecss = 0;
        int vecr = 0;

        int opcion;
        ejercicio1 o = new ejercicio1();
        ejercicio2 u = new ejercicio2();
          ejercicio3 y = new ejercicio3();
           ejercicio4 t = new ejercicio4();

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite el numero del ejercicio");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:

                    do {

                        System.out.println("Digite el vector  " + vec);

                        vecs = teclado.nextInt();
                        o.cargar(vecs);
                        vec++;

                    } while (vec < 8);
                    System.out.println("El valor acumulado es :" + o.acumularElementos());
                    System.out.println("El valor acumulado de vectores mayor que 36 son :" + o.acumularMayores36());
                    System.out.println("La cantidad de vectores mayores que 50 son :" + o.cantidadMayores50());
                    // System.out.println(o.acumularElementos());
                    break;

                case 2:
                    System.out.println("Carga del primer vector.");
                    do {
                        System.out.print("Ingrese elemento  " + vec + " : ");
                        vecsa = teclado.nextInt();
                        u.cargar(vecsa);
                        vec++;
                    } while (vec < 4);
                    System.out.println("Carga del segunto vector.");
                    do {
                        System.out.print("Ingrese elemento  " + vecr + " : ");
                        vecss = teclado.nextInt();
                        u.cargar2(vecss);
                        vecr++;
                    } while (vecr < 4);
                    

                    System.out.println("El valor acumulado es :" + u.vecsumar());

                      case 3:
                    System.out.println("Curso A ");
                    do {
                        System.out.print("Ingrese nota  " + vec + " : ");
                        vecsa = teclado.nextInt();
                        y.cargar(vecsa, vecss);
                        vec++;
                    } while (vec < 4);
                    System.out.println("Curso B. ");
                    do {
                        System.out.print("Ingrese nota  " + vecr + " : ");
                        vecss = teclado.nextInt();
                        y.cargar(vecss,vecsa);
                        vecr++;
                    } while (vecr < 4);
                    

                    System.out.println("El valor acumulado es :" + y.calcularPromedios());

                     case 4:
                    
                    do {
                        System.out.print("Ingrese el elemento  " + vec + " : ");
                        vecs = teclado.nextInt();
                        t.cargar(vecs);
                        vec++;
                    } while (vec < 4);
                 
                    

                    System.out.println("El valor acumulado es :" + t.verificarOrdenado());
            }

            System.out.print("Desea continuar con otra operacion S/N ");

            c = teclado.nextLine().charAt(0);

        } while (c == 's' || c == 'S');

    }
}

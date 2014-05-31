/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularmes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes, num, opcion = 0;
        String result;
        char c = ' ';


        Scanner teclado = new Scanner(System.in);
        

        

        do {
            System.out.print("Digite el Ejerecicio a realizar"+"\n");
            System.out.println("1.Mes"+"\n");
             System.out.println("2.Reporte"+"\n");
             System.out.println("3.Mes"+"\n");
             System.out.println("4.Mes"+"\n");
             
            opcion=Integer.parseInt(teclado.nextLine());
            switch (opcion) 
            {
                case 1:
          clsMes M = new clsMes();
          System.out.print("Digite un numero del 1 al 12");
            mes = Integer.parseInt(teclado.nextLine());

            result = M.Mes(mes);
            System.out.println(result);
            break;
                case 2:
                    clsReporte R= new clsReporte();
                    System.out.print("Digite el numero");
                    num=Integer.parseInt(teclado.nextLine());
            
            }
            
        }while((c=='s')||(c=='S'));
    }
}

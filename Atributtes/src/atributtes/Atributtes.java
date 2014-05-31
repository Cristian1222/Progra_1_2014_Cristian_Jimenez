/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributtes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Atributtes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        int opcion;
        char continuar;
        double monto;

        clsAccount Ac = new clsAccount();
        Scanner teclado = new Scanner(System.in);

        while (validar) {
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion = Integer.parseInt(teclado.nextLine());
 
            if(opcion==1)
            {
            System.out.print("Digite el monto a depositar");
            monto=Double.parseDouble(teclado.nextLine());
            Ac.Deposito(monto);
            
            }
            
            if(opcion==2)
            {
            System.out.println("Digite el monto a retirar");
            monto=Double.parseDouble(teclado.nextLine());
            Ac.Retiro(monto);
            if(Ac.isHayError()){
            System.out.println("El monto que usted va a retirar no puede ser retirado");
            }
            }
            System.out.println("El saldo final es de "+Ac.getSaldoInicial());
            System.out.println("Desea continuar con otra transaccion S/N");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='n'))
                validar=false;
        }

    }
}

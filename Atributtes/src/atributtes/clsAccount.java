/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributtes;

/**
 *
 * @author profe
 */
//atributos de la clase
public class clsAccount {

    private double saldoInicial;
    private boolean hayError;

    //metodo constructor
    public clsAccount() {
        saldoInicial = 0;
        hayError = false;
    }

    //metodo de que sirve para aumentar la cuenta de un usurio 
    public void Deposito(double monto) {
        setSaldoInicial(getSaldoInicial() + monto);
    }

    //metodo para disminuir la cuenta de un usuario 
    public void Retiro(double monto) {
        if (getSaldoInicial() >= monto) 
            setSaldoInicial(getSaldoInicial() - monto);
         else 
            setHayError(true);
        }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}


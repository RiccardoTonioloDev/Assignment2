////////////////////////////////////////////////////////////////////
// RICCARDO TONIOLO 2042332
// RICCARDO CARRARO 2042346
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberAEFiveThousand extends Exception {
    /* Eccezione per i numeri superiori o uguali a 5000 */
    public NumberAEFiveThousand() {
        super("Non esistono numeri romani maggiori di 4999. ");
    }
}

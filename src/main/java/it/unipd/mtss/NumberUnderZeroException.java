////////////////////////////////////////////////////////////////////
// RICCARDO TONIOLO 2042332
// RICCARDO CARRARO 2042346
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    /* Eccezione per i numeri sotto lo zero */
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}
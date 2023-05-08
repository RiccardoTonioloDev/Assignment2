////////////////////////////////////////////////////////////////////
// RICCARDO TONIOLO 2042332
// RICCARDO CARRARO 2042346
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Lettera non accettata: " + c);
    }
}

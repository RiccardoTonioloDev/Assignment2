package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Non possono essere convertite in ascii art lettere che non sono: I, V, X, L, D, C e M. Letter: " + c);
    }
}

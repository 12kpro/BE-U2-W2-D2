package mauro.simoni.beu2w2d2.exceptions;

public class ReqException  extends RuntimeException {

    public ReqException(String lang) {
        super("Lingua: " + lang + " non trovato!");
    }

}

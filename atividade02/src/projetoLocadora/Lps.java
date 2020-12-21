package projetoLocadora;

public class Lps extends Musica {
    private boolean raro;

    public Lps(boolean raro){
        this.raro = raro;
    }

    public boolean getRaro(){
        return raro;
    }
    public void setRaro(boolean raro){
        this.raro = raro;
    }    
}

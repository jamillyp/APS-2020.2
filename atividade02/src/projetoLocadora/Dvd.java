package projetoLocadora;

public class Dvd extends Filme{
    private boolean arranhado;

    public Dvd(boolean arranhado){
        this.arranhado = arranhado;
    }
    public boolean getArranhado(){
        return arranhado;
    }
    public void setArranhado(boolean arranhado){
        this.arranhado = arranhado;
    } 
}


package projetoLocadora;

public class Cds extends Musica{
    private boolean arranhado;

    public Cds(boolean arranhado){
        this.arranhado = arranhado;
    }

    public boolean getArranhado(){
        return arranhado;
    }
    public void setArranhado(boolean arranhado){
        this.arranhado = arranhado;
    } 
    
}

package projetoLocadora;

public class Vhs extends Filme{
    private boolean cores;

    public Vhs(boolean cores){
        this.cores = cores;
    }
    public boolean getCores(){
        return cores;
    }
    public void setCores(boolean cores){
        this.cores = cores;
    } 
    
}

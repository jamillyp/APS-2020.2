package projetoLocadora;

import java.util.ArrayList;

//salvando locacoes em um ArrayList
public class ArrayLocacoes {
    private ArrayList <RepLocacoes> locacoes;

    public ArrayLocacoes(int quant){
        this.locacoes = new ArrayList<RepLocacoes>(quant);
    }
    
}

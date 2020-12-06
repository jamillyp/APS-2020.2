package pacote02;
import pacote01.Produto;
import java.util.*;

public class RevendaComArray {
    private ArrayList<Produto> produtos;
    private int ind;
    
    public RevendaComArray(int quant){
        this.produtos = new ArrayList<Produto>(quant);
    }
    //método especial getProduto
    public Produto getProduto(int codigo){
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                return y;
            }
        }
        System.out.println("Mensagem de Erro: Produto não existe!");
        return null;
    }
    
    //métodos das questões da atividade
    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void comprar(int codigo, int quant){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                y.compra(quant);
            }
        }
        if(bandeira){
            System.out.println("Mensagem de Erro: Produto não existe!");
        }
    }
    
    public void vender(int codigo, int quant){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                y.venda(quant);
            }
        }
        if(bandeira){
            System.out.println("Mensagem de Erro: Produto não existe!");
        }
    }
    
    public void consultaPrecoVenda(int codigo, int quant){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                System.out.println(y.getCusto());
            }
        }
        if(bandeira){
            System.out.println("Mensagem de Erro: Produto não existe!");
        }
    }
    void consultaPrecoVenda(int parseInt) {
        throw new UnsupportedOperationException("Erro!"); 
    }
    
    public void listaPrecos(){
        for(Produto y: produtos){
            System.out.println(y.getCodigo() + " " + y.getDescricao() + " " + y.getCusto() + " " + y.getQtdEstoque());
        }
    }
}

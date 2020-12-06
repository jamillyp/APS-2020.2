package pacote01;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor_compra;
    private double custo;
    private double margem_lucro;
    private int qtd_estoque;

    public Produto( int cod, String d, double v, double c, double m, int q){
        this.codigo = cod;
        this.descricao = d;
        this.valor_compra = v;
        this.custo = c;
        this.margem_lucro = m;
        this.qtd_estoque = q;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigi(int cod){
        this.codigo = cod;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(int d){
        this.codigo = d;
    }
    
    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double c){
        this.custo = c;
    }
    public double getValorCompra(){
        return this.valor_compra;
    }
    public void setValorCompra(double v){
        this.valor_compra = v;
    }
    public double getMargem(){
        return this.margem_lucro;
    }
    public void setMargem(double m){
        this.margem_lucro= m;
    }
    public int getQtdEstoque(){
        return this.qtd_estoque;
    }
    public void setQtdEstoque(int estoque){
        this.codigo = estoque;
    }
    
    public void compra(int quant){
        qtd_estoque = qtd_estoque + quant;
    }

    public void venda(int quant){
        qtd_estoque = qtd_estoque - quant;
    }

    public double calculaPrecoVenda(){
        return valor_compra + custo + margem_lucro*(valor_compra + custo);
    }

    public void status(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor da Compra: " + this.valor_compra);
        System.out.println("Custo: " + this.custo);
        System.out.println("Margem de Lucro: " + this.margem_lucro);
        System.out.println("Quantidade em Estoque: " + this.qtd_estoque);
    }
}

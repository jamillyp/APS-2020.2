package projetoLocadora;

import java.sql.Date;

public class RepLocacoes {
    private String codigoProduto;
    private Date dataSaida;
    private Date dataEntrega;

    public RepLocacoes(String codigoProduto, Date dataSaida, Date dataEntrega){
        this.codigoProduto = codigoProduto;
        this.dataSaida = dataSaida;
        this.dataEntrega = dataEntrega;
    }
    
    public String getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public Date getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public Date getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    // metodos exigidos no trabalho

    // verifica se a data de entrega é menor ou igual a da entrega, caso nao seja calcula a multa
    public void calculaMulta(){
    }

    //adicionar uma locacao
    public void adcLocacao(){

    }
    //remover uma locação ja adicionada, retornar erro se não existir locação
    public void removerLocacao(){

    }
    //retornar uma locação ja adiconada, retornar erro se não existir locação
    public void retornarLocacao(){

    }

}

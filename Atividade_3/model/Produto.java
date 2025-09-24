package Atividade_3.model;

import javax.print.DocFlavor.STRING;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String codigoBarras;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void view(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Quantidade do produto em estoque: " + this.quantidade);
        System.out.println("Código de barras do produto: " + this.codigoBarras);
    }
 
    public Produto(){}
    
}

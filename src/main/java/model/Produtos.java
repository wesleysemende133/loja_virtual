package model;

import atributos.Descricao;
import atributos.Nome;
import atributos.Preco;

public class Produtos {
    private Nome nomeProduto;
    private Descricao descricaoProduto;
    private Preco precoProduto;
    private int quantidadeProduto;

    public Produtos(Nome nomeProduto, Descricao descricaoProduto, Preco precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;

        if (quantidadeProduto < 0) {
            throw new IllegalArgumentException("A quantidade do produto nao pode ser menor que 0.");
        }
        this.quantidadeProduto = quantidadeProduto;
    }

    // Object Calisthenics: expose intent instead of generic getters/setters
    public String nome() {
        return nomeProduto.toString();
    }

    public String descricao() {
        return descricaoProduto.toString();
    }

    public double preco() {
        return precoProduto.valor();
    }

    public int quantidade() {
        return quantidadeProduto;
    }

    public void ajustarPreco(Preco novoPreco) {
        this.precoProduto = novoPreco;
    }

    public void aumentarQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade a adicionar nao pode ser negativa.");
        }
        this.quantidadeProduto += quantidade;
    }

    public void reduzirQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade a remover nao pode ser negativa.");
        }
        if (quantidade > this.quantidadeProduto) {
            throw new IllegalArgumentException("Não há estoque suficiente para remover: " + quantidade);
        }
        this.quantidadeProduto -= quantidade;
    }
}

package model;

import java.math.BigDecimal;

public class Produtos {
    private String nomeProduto;
    private String descricaoProduto;
    private double precoProduto;
    private int quantidadeProduto;

    /// Getters
    public String getNomeProduto(){
        return nomeProduto;
    }

    public String getDescricaoProduto(){
        return descricaoProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public int getQuantidadeProduto(){
        return quantidadeProduto;
    }

    /// Setters
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}

package model;

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
        if(nomeProduto == null || nomeProduto.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }

        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        if(descricaoProduto == null || descricaoProduto.trim().isEmpty()){
            throw new IllegalArgumentException("A descrição do produto não pode ser vazio.");
        }
        this.descricaoProduto = descricaoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if(precoProduto < 0){
            throw new IllegalArgumentException("O preço do produto não pode ser negativo.");
        }
        this.precoProduto = precoProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        if(quantidadeProduto<0){
            throw new IllegalArgumentException("A quantidade do produto nao pode ser menor que 0.");
        }
        this.quantidadeProduto = quantidadeProduto;
    }
}

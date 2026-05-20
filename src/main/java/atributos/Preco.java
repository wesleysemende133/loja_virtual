package atributos;

public class Preco {
    private final double preco;

    public Preco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço do produto não pode ser negativo.");
        }
        this.preco = preco;
    }

    public double valor() {
        return preco;
    }

    @Override
    public String toString() {
        return String.valueOf(preco);
    }
}

package atributos;

public class Descricao {
    private final String descricao;

    public Descricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

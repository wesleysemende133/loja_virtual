package atributos;

public class Nome {
    private final String nome;

    public Nome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

package atributos;

public class Email {
    private final String email;

    public Email(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email não pode ser nulo");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return email;
    }
}

package model;

import atributos.Email;
import atributos.Nome;

public class Usuarios {
    private Nome nomeUsuario;
    private Email email;
    private String password;

    public Usuarios(Nome nomeUsuario, Email email, String password) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password deve ter pelo menos 6 caracteres: " + password);
        }
        this.password = password;
    }

    // Object Calisthenics: expose intent and domain behavior rather than generic getters/setters
    public String nome() {
        return nomeUsuario.toString();
    }

    public String email() {
        return email.toString();
    }

    public String password() {
        return password;
    }

    public void atualizarEmail(Email email) {
        this.email = email;
    }

    public boolean autenticar(String password) {
        return this.password.equals(password);
    }
}

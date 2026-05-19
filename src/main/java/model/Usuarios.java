package model;

public class Usuarios {
    private String nomeUsuario;
    private String email;
    private String password;

    /// Getters
    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

    /// Setters
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password =password;
    }
}

package dao;

import db.Conexao;
import model.Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO(){
        this.connection = Conexao.conectar();
    }

    public void adicionar(Usuarios usuarios){
        String sql = "insert into usuarios" + "(nomeUsuarios, email, password)" + "values(?,?,?)";

        try{
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, usuarios.getNomeUsuario());
            stmt.setString(2, usuarios.getEmail());
            stmt.setString(3,usuarios.getPassword());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

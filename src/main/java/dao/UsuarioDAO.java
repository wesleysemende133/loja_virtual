package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.Conexao;
import model.Usuarios;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO(){
        this.connection = Conexao.conectar();
    }

    public void adicionar(Usuarios usuarios){

        /*  - Atributos do Model(Modelo) Usuarios
            - Adicionamos o values com os pontos de interogacao porque
              nao sabemos quais dados queremos persistir
         */
        String sql = "insert into usuarios(\"nome_usuario\", \"email\", \"password\") values(?,?,?)";

        try{
            PreparedStatement stmt = connection.prepareStatement(sql);

            /// statments para persistir os dados no banco de dados
            stmt.setString(1, usuarios.getNomeUsuario());
            stmt.setString(2, usuarios.getEmail());
            stmt.setString(3,usuarios.getPassword());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void consultar(){
            String sql = "SELECT * FROM usuarios";
            try{
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Nome do Usuario: " + rs.getString("nome_usuario"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Password: " + rs.getString("password"));
                    System.out.println("___________________________________________");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}

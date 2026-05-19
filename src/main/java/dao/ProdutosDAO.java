package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.Conexao;
import model.Produtos;

public class ProdutosDAO {
    private Connection connection;

    public ProdutosDAO(){
        this.connection = Conexao.conectar();
    }

    public void adicionar(Produtos produtos){
        String sql = "insert into produtos(\"nomeProduto\",\"descricaoProduto\", \"precoProduto\", \"quantidadeProduto\") values(?,?,?,?)";

        /// Persitencia de dados
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produtos.getNomeProduto());
            stmt.setString(2,produtos.getDescricaoProduto());
            stmt.setDouble(3,produtos.getPrecoProduto());
            stmt.setInt(4,produtos.getQuantidadeProduto());

            stmt.execute();
            stmt.close();
            connection.commit(); // Confirmar a transação!
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  void consultar(){
        String sql = "SELECT * FROM produtos";
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome do Produto: " + rs.getString("nomeProduto"));
                System.out.println("Descricao do produto: " + rs.getString("descricaoProduto"));
                System.out.println("Preco: " + rs.getDouble("precoProduto"));
                System.out.println("Quantidade: " + rs.getInt("quantidadeProduto"));
                System.out.println("___________________________________________");
            }

    

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

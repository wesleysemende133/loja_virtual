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

    @SuppressWarnings("RedundantStringToString")
    public void adicionar(Produtos produtos){
        String sql = "insert into produtos(\"nome_produto\",\"descricao_produto\", \"preco_produto\", \"quantidade_produto\") values(?,?,?,?)";

        /// Persitencia de dados
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produtos.nome());
            stmt.setString(2, produtos.descricao());
            stmt.setDouble(3, produtos.preco());
            stmt.setInt(4, produtos.quantidade());

            stmt.execute();
            stmt.close();
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
                System.out.println("Nome do Produto: " + rs.getString("nome_produto"));
                System.out.println("Descricao do produto: " + rs.getString("descricao_produto"));
                System.out.println("Preco: " + rs.getDouble("preco_produto"));
                System.out.println("Quantidade: " + rs.getInt("quantidade_produto"));
                System.out.println("___________________________________________");
            }

    

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

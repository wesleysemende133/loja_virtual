package dao;

import db.Conexao;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosDAO {
    private Connection connection;

    public ProdutosDAO(){
        this.connection = Conexao.conectar();
    }

    public void adicionar(Produtos produtos){
        String sql = "insert into produtos" + "(nomeProduto,descricaoProduto, precoProduto, quantidadeProduto)" + "values(?,?,?,?)";

        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produtos.getNomeProduto());
            stmt.setString(2,produtos.getDescricaoProduto());
            stmt.setDouble(3,produtos.getPrecoProduto());
            stmt.setInt(4,produtos.getQuantidadeProduto());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

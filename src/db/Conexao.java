package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static String URL = "jdbc:postgresql://localhost:5432/loja_db";
    private static String USER ="postgres";
    private static String PASSWORD = "hercio.123";

    public static Connection conectar(){
        try{
            Connection conn = DriverManager.getConnection(URL, USER ,PASSWORD);
                System.out.println("Conectado com sucesso");
                return conn;
        }catch (SQLException e){
            System.out.println("Erro ao connectar" + e.getMessage());
            return null;
        }
    }
    public  static void main(String[] args){
        Connection conn = Conexao.conectar();
        if(conn != null){
            System.out.println("Conectado");
        }
    }
}

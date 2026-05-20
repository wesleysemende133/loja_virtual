
import atributos.Descricao;
import atributos.Email;
import atributos.Nome;
import atributos.Preco;
import dao.ProdutosDAO;
import dao.UsuarioDAO;
import model.Produtos;
import model.Usuarios;

public class Main {
    public static void main(String[] args) {
        Usuarios usuario = new Usuarios(
            new Nome("Ana"),
            new Email("ana@exemplo.com"),
            "senha123"
        );

        UsuarioDAO udao = new UsuarioDAO();
        udao.adicionar(usuario);
        udao.consultar();

        Produtos produto = new Produtos(
            new Nome("Camiseta"),
            new Descricao("Camiseta de algodão, tamanho M"),
            new Preco(29.99),
            100
        );

        ProdutosDAO pdao = new ProdutosDAO();
        pdao.adicionar(produto);
        pdao.consultar();
    }
}

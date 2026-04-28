import dao.ProdutosDAO;
import dao.UsuarioDAO;
import db.Conexao;
import model.Produtos;
import model.Usuarios;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UsuarioDAO usuarioDAO =new UsuarioDAO();
        Usuarios usuario = new Usuarios();

  /*      System.out.println(" Bem Vido a loja virtual");

        System.out.println("Escreva o nome do usuario");
        usuario.setNomeUsuario(input.nextLine());
        System.out.println("Escreva o seu email");
        usuario.setEmail(input.nextLine());
        System.out.println("escreva o seu password");
        usuario.setPassword(input.nextLine());

        /// Dados persistodos no banco
        usuarioDAO.adicionar(usuario);
*/
        System.out.println("Persistencia dos produtos");
        Produtos produto = new Produtos();
        ProdutosDAO produtosDAO = new ProdutosDAO();

       /* System.out.println("Escreva o nome do produto");
        produto.setNomeProduto(input.nextLine());
        System.out.println("Escreva a descricao do produto");
        produto.setDescricaoProduto(input.nextLine());
        System.out.println("Digite o preco");
        produto.setPrecoProduto(19.50);
        System.out.println("digite a quantidade");
        produto.setQuantidadeProduto(input.nextInt());

        /// persistencia dos dados
        produtosDAO.adicionar(produto); */

        produtosDAO.consultar();
    }
}
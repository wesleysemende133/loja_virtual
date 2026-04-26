import dao.UsuarioDAO;
import db.Conexao;
import model.Usuarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UsuarioDAO usuarioDAO =new UsuarioDAO();
        Usuarios usuario = new Usuarios();

        usuario.setNomeUsuario("Wesley");
        usuario.setEmail("wesleysemende@gamil.com");
        usuario.setPassword("12345678");

        usuarioDAO.adicionar(usuario);
    }
}
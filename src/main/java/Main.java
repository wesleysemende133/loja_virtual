
import dao.UsuarioDAO;
import model.Usuarios;

public class Main {
    public static void main(String[] args) {
        Usuarios usuario = new Usuarios();
        UsuarioDAO udao = new UsuarioDAO();

        udao.consultar();

    }

}

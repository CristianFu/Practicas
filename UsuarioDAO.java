import java.util.List;
// Define the UsuarioDAO interface
public interface UsuarioDAO {
    public void crearUsuario(Usuario usuario);

    Usuario obtenerUsuarioPorId(int id);

    List<Usuario> obtenerTodosLosUsuarios();

    public void actualizarUsuario(Usuario usuario);
    
    public void eliminarUsuario(int id);
}

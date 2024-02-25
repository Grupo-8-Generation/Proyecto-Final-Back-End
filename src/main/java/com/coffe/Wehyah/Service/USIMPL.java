package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.User;
import com.coffe.Wehyah.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class USIMPL implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> consultarUsuario() {
        return null;
    }

    @Override
    public User crearUsuario(User usuario) {
        return null;
    }

    @Override
    public User modificarUsuario(User usuario) {
        return null;
    }

    @Override
    public User actualizarUsuario(int id) {
        return null;
    }

    @Override
    public User buscarUsuario(int id) {
        return null;
    }

    @Override
    public void eliminarUsuario(int id) {

    }
}

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
        return (List<User>) this.userRepository.findAll();
    }

    @Override
    public User crearUsuario(User usuario) {
        usuario.setAddress(usuario.getAddress());
        return this.userRepository.save(usuario);
    }

    @Override
    public User actualizarUsuario(User usuario) {
        return this.userRepository.save(usuario);
    }

    @Override
    public User buscarUsuario(int id) {
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(int id) {
        this.userRepository.deleteById(id);
    }

//    @Override
//    public User authenticateUser(String username, String password) {
//        // Implement your authentication logic here
//        User user = this.userRepository.findByUsername(username);
//        if (user != null && user.getPassword().equals(password)) {
//            return user;
//        } else {
//            return null;
//        }
//    }
}

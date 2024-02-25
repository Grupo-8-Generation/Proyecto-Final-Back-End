package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.User;

import java.util.List;

public interface UserService {
public List<User> consultarUsuario();
public User crearUsuario(User usuario);
public User modificarUsuario(User usuario);
public User actualizarUsuario(int id);
public User buscarUsuario(int id);
public void eliminarUsuario(int id);
}


package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Product;
import com.coffe.Wehyah.Model.User;

import java.util.List;

public interface ProductService {
    public List<Product> consultarProducto();
    public Product crearProducto(Product product);
    public Product actualizarProducto(Product product);
    public Product buscarProducto(int id);
    public void eliminarProducto(int id);
}

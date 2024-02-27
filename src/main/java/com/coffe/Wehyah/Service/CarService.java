package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.CartItems;

import java.util.List;

public interface CarService {
    public List<CartItems> consultarCarroCompras();
    public CartItems crearCarroCompras(CartItems cartItems);
    public CartItems actualizarCarroCompras(CartItems cartItems);
    public CartItems buscarCarroCompras(int id);
    public void eliminarCarroCompras(int id);
}
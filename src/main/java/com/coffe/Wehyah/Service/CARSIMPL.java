package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.CartItems;
import com.coffe.Wehyah.Repository.CartItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CARSIMPL implements CarService {
    @Autowired
    private CartItemsRepo cartItemsRepo;

    @Override
    public List<CartItems> consultarCarroCompras() {
        return null;
    }

    @Override
    public CartItems crearCarroCompras(CartItems cartItems) {
        return null;
    }

    @Override
    public CartItems modificarCarroCompras(CartItems cartItems) {
        return null;
    }

    @Override
    public CartItems actualizarCarroCompras(int id) {
        return null;
    }

    @Override
    public CartItems buscarCarroCompras(int id) {
        return null;
    }

    @Override
    public void eliminarCarroCompras(int id) {

    }
}

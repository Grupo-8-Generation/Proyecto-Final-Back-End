package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.CartItems;
import com.coffe.Wehyah.Repository.CartItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class CARSIMPL implements CarService {

    @Autowired
    private CartItemsRepo cartItemsRepo;

    @Override
    public List<CartItems> consultarCarroCompras() {

        return (List<CartItems>)this.cartItemsRepo.findAll();
    }

    @Override
    public CartItems crearCarroCompras(CartItems cartItems) {
        cartItems.setProductsCuantity(cartItems.getProductsCuantity());
        return this.cartItemsRepo.save(cartItems);
    }

    @Override
    public CartItems actualizarCarroCompras(CartItems cartItems) {
        return this.cartItemsRepo.save(cartItems);

    }

    @Override
    public CartItems buscarCarroCompras(int id) {
        return this.cartItemsRepo.findById(id).get();
    }

    @Override
    public void eliminarCarroCompras(int id) {
        this.cartItemsRepo.deleteById(id);
    }
}
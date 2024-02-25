package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ORSIMPL implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Override
    public List<Order> consultarOrden() {
        return (List<Order>) this.orderRepo.findAll();
    }

    @Override
    public Order crearOrden(Order order) {

        return null;

    }

    @Override
    public Order modificarOrden(Order order) {
        return null;
    }

    @Override
    public Order actualizarOrden(int id) {
        return null;
    }

    @Override
    public Order buscarOrden(int id) {
        return null;
    }

    @Override
    public void eliminarOrden(int id) {

    }
}

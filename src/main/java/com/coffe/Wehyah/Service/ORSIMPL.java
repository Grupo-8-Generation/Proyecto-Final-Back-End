package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        order.setCreationDate(order.getCreationDate());
        return this.orderRepo.save(order);
    }

    @Override
    public Order actualizarOrden(Order order) {
        return this.orderRepo.save(order);
    }

    @Override
    public Order buscarOrden(int id) {
        return this.orderRepo.findById(id).get();
    }

    @Override
    public void eliminarOrden(int id) {
        orderRepo.deleteById(id);

    }
}
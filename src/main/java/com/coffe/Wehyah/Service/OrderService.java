package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderService  {
    public List<Order> consultarOrden();
    public Order crearOrden(Order order);
    public Order actualizarOrden(Order order);
    public Order buscarOrden(int id);
    public void eliminarOrden(int id);
}

package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Model.OrderDetail;

import java.util.List;

public interface OrderService {
    public List<Order> consultarOrden();
    public Order crearOrden(Order order);
    public Order modificarOrden(Order order);
    public Order actualizarOrden(int id);
    public Order buscarOrden(int id);
    public void eliminarOrden(int id);
}

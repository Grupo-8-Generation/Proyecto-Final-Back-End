package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Model.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderService  {
    public List<Order> consultarDetalleDeOrden();
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail);
    public OrderDetail actualizarDetalleDeOrden(OrderDetail orderDetail);
    public OrderDetail buscarDetalleDeOrden(int id);
    public void eliminarDetalleDeOrden(int id);
}

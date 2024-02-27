package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Model.OrderDetail;
import com.coffe.Wehyah.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ORSIMPL implements OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> consultarDetalleDeOrden() {
        return (List<Order>) this.orderRepo.findAll();
    }

    @Override
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail) {
        orderDetail.setOrder(orderDetail.getOrder());
        return this.orderRepo.save(order)
    }

    @Override
    public OrderDetail actualizarDetalleDeOrden(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public OrderDetail buscarDetalleDeOrden(int id) {
        return null;
    }

    @Override
    public void eliminarDetalleDeOrden(int id) {

    }
}
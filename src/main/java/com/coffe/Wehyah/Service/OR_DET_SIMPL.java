package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Model.OrderDetail;
import com.coffe.Wehyah.Repository.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OR_DET_SIMPL implements OrderService  {

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Override
    public List<Order> consultarDetalleDeOrden() {
        return (List<OrderDetail>)this.orderDetailRepo.findAll();
    }

    @Override
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail) {

        orderDetail.setAddress(orderDetail.getAddress());
        return this.orderDetailRepo.save(orderDetail);
    }

    @Override
    public OrderDetail actualizarDetalleDeOrden(OrderDetail orderDetail) {
        return this.orderDetailRepo.save(orderDetail);
    }

    @Override
    public OrderDetail buscarDetalleDeOrden(int id)
    {
        return this.orderDetailRepo.findById(id).get();
    }

    @Override
    public void eliminarDetalleDeOrden(int id)
    {
        this.orderDetailRepo.deleteById(id);
    }
}

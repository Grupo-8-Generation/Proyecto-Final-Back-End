package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.OrderDetail;
import com.coffe.Wehyah.Repository.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ODetalleSIMPL implements OrDeService
{

    @Autowired
    private OrderDetailRepo repo;
    @Override
    public List<OrderDetail> consultarDetalleDeOrden() {
        return (List<OrderDetail>)this.repo.findAll();
    }

    @Override
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail) {
        orderDetail.setAddress(orderDetail.getAddress());
        return this.repo.save(orderDetail);
    }

    @Override
    public OrderDetail actualizarDetalleDeOrden(OrderDetail orderDetail) {
        return this.repo.save(orderDetail);
    }

    @Override
    public OrderDetail buscarDetalleDeOrden(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarDetalleDeOrden(int id)
    {
        this.repo.deleteById(id);
    }
}

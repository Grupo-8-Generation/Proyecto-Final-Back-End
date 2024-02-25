package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OR_DET_SIMPL implements OrDeService  {
    @Override
    public List<OrderDetail> consultarDetalleDeOrden() {
        return null;
    }

    @Override
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public OrderDetail modificarDetalleDeOrden(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public OrderDetail actualizarDetalleDeOrden(int id) {
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

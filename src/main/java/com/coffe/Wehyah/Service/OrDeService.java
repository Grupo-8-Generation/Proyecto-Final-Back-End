package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.OrderDetail;
import com.coffe.Wehyah.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrDeService  {
    public List<OrderDetail> consultarDetalleDeOrden();
    public OrderDetail crearDetalleDeOrden(OrderDetail orderDetail);
    public OrderDetail modificarDetalleDeOrden(OrderDetail orderDetail);
    public OrderDetail actualizarDetalleDeOrden(int id);
    public OrderDetail buscarDetalleDeOrden(int id);
    public void eliminarDetalleDeOrden(int id);
}

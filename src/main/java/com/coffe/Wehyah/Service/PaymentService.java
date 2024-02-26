package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.Payment;
import java.util.List;
public interface PaymentService {
    public List<Payment> consultarPagos();
    public Payment crearPagos(Payment payment);
    public Payment actualizarPagos(Payment payment);
    public Payment buscarPagos(int id);
    public void eliminarPagos(int id);
}

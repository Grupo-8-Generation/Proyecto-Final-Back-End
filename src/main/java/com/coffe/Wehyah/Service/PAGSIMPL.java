package com.coffe.Wehyah.Service;

import com.coffe.Wehyah.Model.Payment;
import com.coffe.Wehyah.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PAGSIMPL implements PaymentService{

    @Autowired
    private PaymentRepo repo;

    @Override
    public List<Payment> consultarPagos() {
        return (List<Payment>)this.repo.findAll();
    }

    @Override
    public Payment crearPagos(Payment payment) {

        payment.setPaymentDate(payment.getPaymentDate());
        return this.repo.save(payment);
    }


    @Override
    public Payment actualizarPagos(Payment payment) {

        return this.repo.save(payment);
    }

    @Override
    public Payment buscarPagos(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPagos(int id) {
        this.repo.deleteById(id);
    }
}

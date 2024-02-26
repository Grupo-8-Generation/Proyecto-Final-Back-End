package com.coffe.Wehyah.Repository;

import com.coffe.Wehyah.Model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, Integer> {
}

package com.coffe.Wehyah.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<PaymentRepo, Integer> {
}

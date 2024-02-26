package com.coffe.Wehyah.Repository;

import com.coffe.Wehyah.Model.CartItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemsRepo extends CrudRepository<CartItems, Integer> {
}

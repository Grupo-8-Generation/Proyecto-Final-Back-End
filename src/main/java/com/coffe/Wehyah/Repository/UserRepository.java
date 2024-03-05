package com.coffe.Wehyah.Repository;

import com.coffe.Wehyah.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
//    User findByUsername(String username);
}

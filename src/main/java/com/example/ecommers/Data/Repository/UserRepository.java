package com.example.ecommers.Data.Repository;

import com.example.ecommers.Data.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}

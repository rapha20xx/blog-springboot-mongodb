package com.raphaelsantos.blogSpringbootMongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raphaelsantos.blogSpringbootMongodb.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

}

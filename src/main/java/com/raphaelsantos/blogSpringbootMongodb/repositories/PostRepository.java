package com.raphaelsantos.blogSpringbootMongodb.repositories;

import com.raphaelsantos.blogSpringbootMongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}

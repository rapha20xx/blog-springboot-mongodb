package com.raphaelsantos.blogSpringbootMongodb.services;

import com.raphaelsantos.blogSpringbootMongodb.domain.Post;
import com.raphaelsantos.blogSpringbootMongodb.repositories.PostRepository;
import com.raphaelsantos.blogSpringbootMongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}


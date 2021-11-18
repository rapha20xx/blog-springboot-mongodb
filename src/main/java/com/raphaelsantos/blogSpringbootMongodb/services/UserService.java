package com.raphaelsantos.blogSpringbootMongodb.services;

import com.raphaelsantos.blogSpringbootMongodb.domain.User;
import com.raphaelsantos.blogSpringbootMongodb.dto.UserDTO;
import com.raphaelsantos.blogSpringbootMongodb.repositories.UserRepository;
import com.raphaelsantos.blogSpringbootMongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }


    public User findById(String id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO ObjDto){
        return new User (ObjDto.getId(), ObjDto.getName(), ObjDto.getEmail());
    }
}
package com.raphaelsantos.blogSpringbootMongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaelsantos.blogSpringbootMongodb.domain.User;
import com.raphaelsantos.blogSpringbootMongodb.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
}

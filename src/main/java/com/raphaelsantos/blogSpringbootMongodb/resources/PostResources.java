package com.raphaelsantos.blogSpringbootMongodb.resources;

import com.raphaelsantos.blogSpringbootMongodb.domain.Post;
import com.raphaelsantos.blogSpringbootMongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

	@Autowired
	private PostService postService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = postService.findById(id);
		return (ResponseEntity<Post>) ResponseEntity.ok().body(obj);
	}
}

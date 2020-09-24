package com.rafaelbaetapena.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelbaetapena.workshopmongo.domain.Post;
import com.rafaelbaetapena.workshopmongo.repository.PostRepository;
import com.rafaelbaetapena.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato"));
	}
}

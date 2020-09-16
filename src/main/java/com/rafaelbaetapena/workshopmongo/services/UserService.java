package com.rafaelbaetapena.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelbaetapena.workshopmongo.domain.User;
import com.rafaelbaetapena.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> finfAll(){
		return repo.findAll();
	}
}

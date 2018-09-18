package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Login;

public interface ILoginService {	
	

	List<Login> findByUsername(String username);

	Optional<Login> findOne(Long id);	

	void update(Login login);

	void delete(Login login);

	List<Login> findAll();

	Login create(Login login);

}

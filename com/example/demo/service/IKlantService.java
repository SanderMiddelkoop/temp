package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Klant;

public interface IKlantService {

	Optional<Klant> findOne(Long id);
	
	public List <Klant> findAll(); 
	
	public Klant create(Klant klant); 
	
	public void update (Klant klant); 
	
	public void delete (Klant klant); 
	
	
	
	public List <Klant> findByName(String name);

	public List<Klant> findByLastName(String lastName);

	public List<Klant> findByAdress(String adress); 

}

# H2
#spring.h2.console.enabled=true
#spring.h2.console.path=/h2

# Datasource
#spring.datasource.url=jdbc:h2:mem:test
#spring.datasource.username=sa
#spring.datasource.password=
#spring.datasource.driver-class-name=org.h2.Driver

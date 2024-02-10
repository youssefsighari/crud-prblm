package com.youssef.crud.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.crud.model.Client;
import com.youssef.crud.repository.ClientRepository;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1/")
public class controller {
	
	@Autowired
	private ClientRepository clientRepository;
	
	// get all employees*
		@GetMapping("/getAll")
		public List<Client> getAllEmployees(){
			return clientRepository.findAll();
		}	
		
	
	
	

}

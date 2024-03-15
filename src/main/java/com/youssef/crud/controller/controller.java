package com.youssef.crud.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.crud.model.Client;
import com.youssef.crud.repository.ClientRepository;
import net.javaguides.springboot.exception.ResourceNotFoundException;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class controller {
	
	@Autowired
	private ClientRepository clientRepository;
	
	// get all client*
		@GetMapping("/getAll")
		public List<Client> getAllClient(){
			return clientRepository.findAll();
		}	
		
	
	
		
		@PostMapping("/getAll")
		public Client createClient(@RequestBody Client client) {
			return clientRepository.save(client);
		}
		
		@PutMapping("/client/{id}")
		public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client clientDetails){
			Client client = clientRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("client not exist with id :" + id));
			
			client.setName(clientDetails.getName());
			client.setLastName(clientDetails.getLastName());
			client.setEmail(clientDetails.getEmail());
			
			Client updatedClient = clientRepository.save(client);
			return ResponseEntity.ok(updatedClient);
		}
	
	 
	

}

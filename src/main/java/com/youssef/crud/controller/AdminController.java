package com.youssef.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.crud.model.Admin;
import com.youssef.crud.repository.AdminRepo;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminRepo repo;
	
	@PostMapping("/login")
	public ResponseEntity<?> LoginAdmin(@RequestBody Admin adminData){
		Admin admin=repo.findByAdminId(adminData.getId());
		if(admin.getPassword().equals(adminData.getPassword()))
			return ResponseEntity.ok(admin);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
	}

}

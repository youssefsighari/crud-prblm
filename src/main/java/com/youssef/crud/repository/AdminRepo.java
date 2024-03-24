package com.youssef.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.youssef.crud.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

	Admin findByAdminId(Long userId);

	

	

}


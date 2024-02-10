package com.youssef.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.youssef.crud.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}

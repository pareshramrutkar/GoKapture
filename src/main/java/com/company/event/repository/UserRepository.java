package com.company.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.event.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
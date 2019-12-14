package com.prodapt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.app.model.prodapt.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
}

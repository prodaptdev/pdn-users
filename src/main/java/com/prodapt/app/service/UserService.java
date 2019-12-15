package com.prodapt.app.service;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prodapt.app.exception.UserNotFoundException;
import com.prodapt.app.model.dto.ApiResponse;
import com.prodapt.app.model.prodapt.Users;
import com.prodapt.app.repository.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	UsersRepository usersRepo;
	
	private static final Logger log = LogManager.getLogger(UserService.class.getName());
	
	public List<Users> getAllUsersFromRepo() {
		log.info("calling user repo for all users");
		
		return usersRepo.findAll();
	}

	public Users getUsersByIdFromRepo(String userId) {
		log.info("calling user repo for user "+userId);
		
		return usersRepo.findById(userId).orElseThrow(()->new UserNotFoundException(userId));
	}

	public ResponseEntity<ApiResponse> saveUsersInRepo(List<Users> users) {
		
		log.info("calling user repo for saving the user details");
		
		usersRepo.saveAll(users);		
		
		return new ResponseEntity<>(new ApiResponse("Successfully created/updated the user",new Date(),HttpStatus.CREATED), HttpStatus.CREATED);
	}

	public ResponseEntity<ApiResponse> deleteUserByIdFromRepo(String id) {
		log.info("calling user repo for saving the user details");
		
		usersRepo.deleteById(id);		
		
		return new ResponseEntity<>(new ApiResponse("Successfully deleted the user "+id,new Date(),HttpStatus.OK), HttpStatus.OK);
	}
}

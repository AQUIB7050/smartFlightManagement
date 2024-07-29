package com.flightManagement.dao;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.flightManagement.models.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByUserNameAndUserPassword(String userName, String userPassword);

}

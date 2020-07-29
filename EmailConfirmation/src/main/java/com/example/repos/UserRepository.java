package com.example.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.User;

public interface UserRepository extends CrudRepository<User, String> {

	User findByEmailIdIgnoreCase(String emailId);
}

package com.example.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {

	ConfirmationToken findByConfirmationToken(String confirmationToken);
}

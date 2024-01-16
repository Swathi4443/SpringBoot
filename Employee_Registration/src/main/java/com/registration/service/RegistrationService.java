package com.registration.service;

import java.util.Optional;

import com.registration.entity.Registration;

public interface RegistrationService {
	
	public void save(Registration registration);
	public Optional<Registration> findById(int id);

}

package com.registration.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.Registration;
import com.registration.repository.RegistrationRepository;
import com.registration.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository ;

	@Override
	public void save(Registration registration) {
		// TODO Auto-generated method stub
		registrationRepository.save(registration);
		
	}

	@Override
	public Optional<Registration> findById(int id) {
	Optional<Registration> register=registrationRepository.findById(id);
	return register;
		
	}

	

	
	
	

	

}

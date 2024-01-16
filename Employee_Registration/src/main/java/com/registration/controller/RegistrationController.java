package com.registration.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.entity.Registration;
import com.registration.service.RegistrationService;

@RestController
@RequestMapping("/Registration")
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	@GetMapping(path="/GET")
	public ResponseEntity display() {
		System.out.println("controller");
		return null;
		
	}
    @PostMapping
    @RequestMapping("/save1")
	public ResponseEntity<Registration> save(@RequestBody Registration registration){
    	registrationService.save(registration);
    	ResponseEntity<Registration> responseEntity = new ResponseEntity<>(registration,
				HttpStatus.CREATED);
		return responseEntity;
		
	}
    @GetMapping(path="/fetch/{id}")
    public ResponseEntity<Registration> getById(@PathVariable(value="id")int id){
    Optional<Registration> result=	registrationService.findById(id);
    	
		return new ResponseEntity<Registration>(result.get(),HttpStatus.OK);
    	
    }
    
	

}

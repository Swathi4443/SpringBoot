package com.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.LoginEntity;
@RestController
@RequestMapping("/Login")
public class LoginController {
	
	
	@GetMapping(path="/GET")
	public ResponseEntity<String> display() {
		System.out.println("controller");
	    return new ResponseEntity<>("login successfull",HttpStatus.OK);	
	}
	@PostMapping(path="/save")
	public ResponseEntity<LoginEntity> save(@RequestBody LoginEntity loginEntity){
		
		return new ResponseEntity<LoginEntity>(loginEntity,HttpStatus.OK);
		
	}
	
	

}

package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}

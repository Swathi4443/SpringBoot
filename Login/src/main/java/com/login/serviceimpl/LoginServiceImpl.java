package com.login.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.login.bean.LoginBean;
import com.login.bean.RegistrationBean;
import com.login.entity.LoginEntity;
import com.login.repository.LoginRepository;
import com.login.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoginRepository loginRepository;
 
	@Override
	public LoginBean get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(LoginEntity loginEntity) {
		String url = "http://localhost:8080/api/Registration/" ;
		
//		Optional<LoginEntity> loginOptional = loginRepository.findById(id);
//		LoginEntity loginEntity = loginOptional.get();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<>(headers);
		ResponseEntity<RegistrationBean> responseEntity = restTemplate.exchange(url,
				HttpMethod.GET, httpEntity, RegistrationBean.class);
		RegistrationBean registrationBean = responseEntity.getBody();
		loginRepository.save(loginEntity);
		
	}

	

}

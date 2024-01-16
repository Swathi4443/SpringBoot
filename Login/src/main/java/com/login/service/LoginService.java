package com.login.service;

import com.login.bean.LoginBean;
import com.login.entity.LoginEntity;

public interface LoginService {
	
	public void save(LoginEntity loginEntity);
	
	public LoginBean get();

}

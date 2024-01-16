package com.login.bean;

public class LoginBean {

	private int id;

	private String email;

	private String password;
	
	private RegistrationBean registrationBean;
	
	

	public LoginBean(int id, String email, String password, RegistrationBean registrationBean) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.registrationBean = registrationBean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegistrationBean getRegistrationBean() {
		return registrationBean;
	}

	public void setRegistrationBean(RegistrationBean registrationBean) {
		this.registrationBean = registrationBean;
	}
	

}

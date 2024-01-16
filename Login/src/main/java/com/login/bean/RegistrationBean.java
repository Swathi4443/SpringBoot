package com.login.bean;


	public class RegistrationBean {

		private int id;

		private String firstName;

		private String lastName;

		private int age;

		private String gender;

		private String email;

		private long phoneNumber;

		private String password;

		private String State;

		private String country;

		private long pinCode;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public long getPinCode() {
			return pinCode;
		}

		public void setPinCode(long pinCode) {
			this.pinCode = pinCode;
		}

		public RegistrationBean(int id, String firstName, String lastName, int age, String gender, String email,
				long phoneNumber, String password, String state, String country, long pinCode) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.gender = gender;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.password = password;
			State = state;
			this.country = country;
			this.pinCode = pinCode;
		}

}

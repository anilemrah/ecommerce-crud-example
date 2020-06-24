package com.anilemrah.dolap.model;

public class UserResponse {
	private String email;
	private String firstName;
	private String lastName;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "UserResponse [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
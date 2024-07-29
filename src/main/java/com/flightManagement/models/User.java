package com.flightManagement.models;



import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



@Document(collection = "user")
public class User {
	
	@Indexed(unique = true)
	@NotBlank(message ="userName cannot be left blank")
	@Size(min=3, max=16, message="the length should be between 3-16 characters")
	private String userName;
	
	@Pattern(regexp="[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="invalid email address")
	private String userEmail;
	
	@Size(min=8, message="password must be of atleast 8 characters")
	private String userPassword;
	
	@AssertTrue(message="Must Agree T & C")
	private boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	public User(String userName, String userEmail, String userPassword, boolean agreed) {
		super();
	
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.agreed = agreed;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", agreed=" + agreed + "]";
	}
	
	
	
	
	

}

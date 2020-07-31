package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String userId; 
	
	@Column(nullable = false)
	private String first_name;
	
	@Column(nullable = false)
	private String last_name; 
	
	@Column(nullable = false, unique = true)
	private String email;
	
	private String encryptedPassword; 
	private boolean emailVerification; 
	
	public User() {
	}

	public User(String userId, String first_name, String last_name, String email, String encryptedPassword, boolean emailVerification) {
		this.userId = userId; 
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.encryptedPassword = encryptedPassword;
		this.emailVerification = emailVerification; 
	}

	public Long getId() {
		return id;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public boolean isEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(boolean emailVerification) {
		this.emailVerification = emailVerification;
	}

	
	
	
}
package dto;

public class UsersDto {

	private Long id;
	private String userId;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String encryptedPassword;
	private boolean emailVerification;

	public UsersDto() {
	}

	public UsersDto(Long id, String userId, String first_name, String last_name, String email, String password,
			String encryptedPassword, boolean emailVerification) {
		this.id = id;
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

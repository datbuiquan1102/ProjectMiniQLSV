package MODEL;

public class LoginModel {
	private String fullname;
	private String email;
	private int numberphone;
	private String username;
	private String password;
	
	public LoginModel() {
		
	}
	
	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public LoginModel(String fullname, String email, int numberphone, String username, String password) {
		this.fullname = fullname;
		this.email = email;
		this.numberphone = numberphone;
		this.username = username;
		this.password = password;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberphone() {
		return numberphone;
	}

	public void setNumberphone(int numberphone) {
		this.numberphone = numberphone;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

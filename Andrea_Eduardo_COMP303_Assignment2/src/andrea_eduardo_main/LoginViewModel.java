/**
 * 
 */
package andrea_eduardo_main;

/**
 * @author EduardoSantana
 *
 */
public class LoginViewModel {

	private String username;
	private String password;
	private String error;
	
	/**
	 * @param username
	 * @param password
	 * @param error
	 */
	public LoginViewModel(String username, String password, String error) {
		this.username = username;
		this.password = password;
		this.error = error;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	
	

}

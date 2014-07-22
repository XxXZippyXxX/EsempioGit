package model;



/**
 * 
 * @author alessandra.smarra
 *
 */
public class Utente {
	private String username;
	private String password;
	
	
	
	public Utente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Utente() {

	}
	/**
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}

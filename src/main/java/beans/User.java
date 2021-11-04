/**
 * 
 */
package beans;

import java.time.LocalDate;

/**
 * @author Administrateur
 *
 */
public class User {
	private int id;
	private String userName;
	private String password;
	private LocalDate birthday;
	
	public User() {
	}

	public User(String userName, LocalDate birthday, String password) {
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
	}
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public User(int id, String userName, LocalDate birthday, String password) {
		this(userName, birthday, password);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", birthday=" + birthday + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}

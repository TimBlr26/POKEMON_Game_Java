package forms;

import beans.User;

public class LoginForm {
	private String pseudo = "";
	private String password = "";
	private boolean isError = false;
	private String pseudoErrorMessage;
	private String passwordErrorMessage;
	private String result;
	private final String WRONG_WRITE = "Une saisie est incorrecte";
	
	public LoginForm() {}
	
	public void validLoginForm() {
		if (this.pseudo.length() < 5) {
			System.out.println("pseudo trop court");
			this.result = WRONG_WRITE;
			this.pseudoErrorMessage = "Le pseudo doit au moins contenir 5 caractères";
			this.isError = true;
		} else if (this.password.length() < 5) {
			System.out.println("password trop court");
			this.result = WRONG_WRITE;
			this.passwordErrorMessage = "Le password doit au moins contenir 5 caractères";
			this.isError = true;
		} else {
			this.result = "Connection réussie !! ";
		}
	}
	
	public User getLogUser() {
		return new User(this.pseudo, this.password);
	}

	@Override
	public String toString() {
		return "LoginForm [pseudo=" + pseudo + ", password=" + password + ", isError=" + isError
				+ ", pseudoErrorMessage=" + pseudoErrorMessage + ", passwordErrorMessage=" + passwordErrorMessage
				+ ", result=" + result + ", WRONG_WRITE=" + WRONG_WRITE + "]";
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}


	public String getPseudoErrorMessage() {
		return pseudoErrorMessage;
	}

	public void setPseudoErrorMessage(String pseudoErrorMessage) {
		this.pseudoErrorMessage = pseudoErrorMessage;
	}

	public String getPasswordErrorMessage() {
		return passwordErrorMessage;
	}

	public void setPasswordErrorMessage(String passwordErrorMessage) {
		this.passwordErrorMessage = passwordErrorMessage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}

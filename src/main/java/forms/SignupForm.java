package forms;

import java.time.LocalDate;

import beans.User;

public class SignupForm {
	private String pseudo = "";
	private String password = "";
	private boolean isError = false;
	private LocalDate birthday;
	private String pseudoErrorMessage;
	private String birthdayErrorMessage;
	private String passwordErrorMessage;
	private String result;
	private final String WRONG_WRITE = "Une saisie est incorrecte";
	private final int MIN_AGE = 18;
	
	public SignupForm() {}
	
	public void validSignupForm() {
		if (this.pseudo.length() < 5) {
			this.result = WRONG_WRITE;
			this.pseudoErrorMessage = "Le pseudo doit au moins contenir 5 caractères";
			this.isError = true;
		}else if ((this.birthday).until(LocalDate.now()).getYears() < MIN_AGE) {
			this.result = WRONG_WRITE;
			this.passwordErrorMessage = "Il faut avoir + de " + MIN_AGE + " pour s'inscrire!";
			this.isError = true;
		} else if (this.password.length() < 5) {
			this.result = WRONG_WRITE;
			this.passwordErrorMessage = "Le password doit au moins contenir 5 caractères";
			this.isError = true;
		} else {
			this.result = "Inscription réussie !! Vous pouvez donc vous connecter.";
		}
	}
	
	public User getNewUser() {
		return new User(this.pseudo, this.birthday, this.password);
	}
	

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = LocalDate.parse(birthday);
	}

	public String getBirthdayErrorMessage() {
		return birthdayErrorMessage;
	}

	public void setBirthdayErrorMessage(String birthdayErrorMessage) {
		this.birthdayErrorMessage = birthdayErrorMessage;
	}

	@Override
	public String toString() {
		return "SignupForm [pseudo=" + pseudo + ", password=" + password + ", birthday=" + birthday + "]";
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
package forms;

public class LanguageForm {
	private String language;
	private String path;

	public LanguageForm() {
	}
	
	public LanguageForm(String language, String path) {
		this.language = language;
		this.path = path;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "languageForm [language=" + language + ", path=" + path + "]";
	}
	

}

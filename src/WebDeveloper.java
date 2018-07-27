
public class WebDeveloper extends Developer {

	private String language;

	public WebDeveloper(String fName, String lName, Long id, int sabeghe, String lastJob, String language) {
		super(fName, lName, id, sabeghe, lastJob);
		this.language = language;
	}

	public String getLang() {
		return language;
	}

}
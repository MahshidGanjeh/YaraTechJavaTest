
public class YaraTechJavaTest {

}

class Employee {

	String firstName;
	String lastName;
	int nationalId;
	int sabegheKar;

	public Employee(String fName, String lName, int id, int s) {
		firstName = fName;
		lastName = lName;
		nationalId = id;
		sabegheKar = s;
	}

}

class Accountant extends Employee {

	String lastDegree;

	public Accountant(String fName, String lName, int id, int s, String l) {
		super(fName, lName, id, s);
		lastDegree = l;
	}
}

class Developer extends Employee {

	String lastJobStaus;

	public Developer(String fName, String lName, int id, int s, String l) {
		super(fName, lName, id, s);
		lastJobStaus = l;

	}

}

class WebDeveloper extends Developer {
	String language;

	public WebDeveloper(String fName, String lName, int id, int s, String l, String language) {
		super(fName, lName, id, s, l);
		this.language = language;
	}
}

class MobileDeveloper extends Developer {
	int numberOfPublishedApps;

	public WebDeveloper(String fName, String lName, int id, int s, String l,int number) {
		super(fName, lName, id, s,l);
		numberOfPublishedApps = number;
	}
}

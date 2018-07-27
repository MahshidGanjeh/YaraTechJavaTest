public class Employee {

	private String firstName;
	private String lastName;
	private Long nationalId;
	private int numberOfYearsOfExperience;
	
	public Employee() {
	}

	public Employee(String fName, String lName, Long id, int s) {
		firstName = fName;
		lastName = lName;
		nationalId = id;
		numberOfYearsOfExperience = s;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getId() {
		return nationalId;
	}

	public int getNumberOfYearsOfExperience() {
		return numberOfYearsOfExperience;
	}

}
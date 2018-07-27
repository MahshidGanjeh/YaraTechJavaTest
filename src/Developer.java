
public class Developer extends Employee {

	private String lastJobStaus;
	
	public Developer() {
		
	}

	public Developer(String fName, String lName, Long id,
			int numberOfYearsOfExperience, String lastJobStatus) {
		super(fName, lName, id, numberOfYearsOfExperience);
		this.lastJobStaus = lastJobStatus;
	}
	
	public String getLastJobStatus(){
		return lastJobStaus;
	}
}
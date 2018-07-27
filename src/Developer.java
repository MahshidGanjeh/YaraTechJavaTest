
public class Developer extends Employee {

	private String lastJobStaus;

	public Developer(String fName, String lName, Long id, int sabeghe, String lastJob) {
		super(fName, lName, id, sabeghe);
		lastJobStaus = lastJob;
	}
	
	public String getLastJob(){
		return lastJobStaus;
	}
}

public class Accountant extends Employee {

	private String lastDegree;

	public Accountant(String fName, String lName, Long id, int sabeghe, String lastDegree) {
		super(fName, lName, id, sabeghe);
		this.lastDegree = lastDegree;
	}
	
	public String getLastDegree(){
		return lastDegree;
	}
}
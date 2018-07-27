
public class MobileDeveloper extends Developer {
	
	private int numberOfPublishedApps;

	public MobileDeveloper(String fName, String lName, Long id, int sabeghe, String lastJob, int number) {
		super(fName, lName, id, sabeghe, lastJob);
		numberOfPublishedApps = number;
	}

	public int getNumbberOfPublishedApps() {
		return numberOfPublishedApps;
	}
}

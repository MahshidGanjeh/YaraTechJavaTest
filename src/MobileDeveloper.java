import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MobileDeveloper extends Developer {

	private static final String MobileDeveloperDirectoryPath = "Mobile.txt";

	private int numberOfPublishedApps;

	public MobileDeveloper() {

	}

	public MobileDeveloper(String fName, String lName, Long id, int sabeghe, String lastJob, int number) {
		super(fName, lName, id, sabeghe, lastJob);
		numberOfPublishedApps = number;
	}

	public int getNumbberOfPublishedApps() {
		return numberOfPublishedApps;
	}

	public void writeMobileDeveloperInfoToFile() {

		File file = new File(MobileDeveloperDirectoryPath);
		FileOutputStream fileOutputStream = null;
		PrintWriter printWriter = null;

		try {
			fileOutputStream = new FileOutputStream(file, true);
			printWriter = new PrintWriter(fileOutputStream);
			printWriter.println(this.getFirstName());
			printWriter.println(this.getLastName());
			printWriter.println(this.getId());
			printWriter.println(this.getNumberOfYearsOfExperience());
			printWriter.println(this.getLastJobStatus());
			printWriter.println(this.getNumbberOfPublishedApps());

			printWriter.flush();
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readMobileDeveloperInfoFromFile() {

		File file = new File(MobileDeveloperDirectoryPath);
		FileInputStream fileInputStream = null;
		Scanner scanner = null;

		try {
			fileInputStream = new FileInputStream(file);
			scanner = new Scanner(fileInputStream);

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

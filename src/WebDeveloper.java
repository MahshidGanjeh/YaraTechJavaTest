import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WebDeveloper extends Developer {

	private String programmingLanguage;
	private static final String WebDeveloperDirectoryPath = "Web.txt";
	
	public WebDeveloper(){
		
	}

	public WebDeveloper(String fName, String lName, Long id, int numberOfYearsOfExperience, String lastJobStatus,
			String language) {
		super(fName, lName, id, numberOfYearsOfExperience, lastJobStatus);
		programmingLanguage = language;
	}

	public String getLang() {
		return programmingLanguage;
	}

	public void writeWebDeveloperInfoToFile() {

		File file = new File(WebDeveloperDirectoryPath);
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
			printWriter.println(this.getLang());

			printWriter.flush();
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readWebDeveloperInfoFromFile(){
		
		File file = new File(WebDeveloperDirectoryPath);
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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Accountant extends Employee {

	private static final String AccountantDirectoryPath = "D:\\Programming\\Java\\YaraTechJavaTest\\Acc.txt";
	private String lastDegree;

	public Accountant() {

	}

	public Accountant(String fName, String lName, Long id, int numberOfYearsOfExperience, String lastDegree) {
		super(fName, lName, id, numberOfYearsOfExperience);
		this.lastDegree = lastDegree;
	}

	public String getLastDegree() {
		return lastDegree;
	}

	public void writeAccountantInfoToFile() {

		File file = new File(AccountantDirectoryPath);
		FileOutputStream fileOutputStream = null;
		PrintWriter printWriter = null;
		try {
			fileOutputStream = new FileOutputStream(file, true);
			printWriter = new PrintWriter(fileOutputStream);
			printWriter.println(this.getFirstName());
			printWriter.println(this.getLastName());
			printWriter.println(this.getId());
			printWriter.println(this.getNumberOfYearsOfExperience());
			printWriter.println(this.getLastDegree());

			printWriter.flush();
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readAccountantInfoFromFile() {

		File file = new File(AccountantDirectoryPath);
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
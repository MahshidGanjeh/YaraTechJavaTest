import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class YaraTechJavaTest {

	private static final String WebDeveloperDirectoryPath = "D:\\Programming\\Java\\YaraTechJavaTest\\Web.txt";
	private static final String MobileDeveloperDirectoryPath = "D:\\Programming\\Java\\YaraTechJavaTest\\Mobile.txt";
	private static final String AccountantDirectoryPath = "D:\\Programming\\Java\\YaraTechJavaTest\\Acc.txt";

	public static void main(String[] args) {

		String firstName, lastName;
		Long id;
		int sabeghe;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter accountant, webDev or mobileDev to continue");

		switch (input.nextLine()) {
		case ("accountant"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your SabegheKar");
			sabeghe = input.nextInt();
			System.out.println("Enter Your LastDegree");
			String last = input.next();
			Accountant acc = new Accountant(firstName, lastName, id, sabeghe, last);
			break;

		case ("webDev"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your SabegheKar");
			sabeghe = input.nextInt();
			System.out.println("Enter Your LastJob");
			String lastJob = input.next();
			System.out.println("Enter Your Language");
			String lang = input.next();
			WebDeveloper web = new WebDeveloper(firstName, lastName, id, sabeghe, lastJob, lang);
			break;

		case ("mobileDev"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your NumberOfYearsOfExperience");
			sabeghe = input.nextInt();
			System.out.println("Enter Your LastJob");
			String lastjob = input.next();
			System.out.println("Enter Your NumberOfPublishedApp");
			int number = input.nextInt();
			MobileDeveloper mobileDev = new MobileDeveloper(firstName, lastName, id, sabeghe, lastjob, number);

	
			File file = new File(MobileDeveloperDirectoryPath);
			FileOutputStream fileOutputStream = null;
			FileInputStream fileInputStream = null;
			
			PrintWriter printWriter = null;
			Scanner scanner = null;
			
			try {
				fileOutputStream = new FileOutputStream(file, true);
				printWriter = new PrintWriter(fileOutputStream);
				printWriter.println(mobileDev.getFirstName());
				printWriter.println(mobileDev.getLastName());
				printWriter.println(mobileDev.getId());
				printWriter.println(mobileDev.getNumberOfYearsOfExperience());
				printWriter.println(mobileDev.getLastJob());
				printWriter.println(mobileDev.getNumbberOfPublishedApps());
				
				printWriter.flush();
				printWriter.close();
				
				fileInputStream = new FileInputStream(file);
				scanner = new Scanner(fileInputStream);
				
				while (scanner.hasNext()){
					System.out.println(scanner.nextLine());
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			break;
		}
	}
}

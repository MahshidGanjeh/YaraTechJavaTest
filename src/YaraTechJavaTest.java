
import java.util.Scanner;

public class YaraTechJavaTest {

	public static void main(String[] args) {

		String firstName, lastName;
		Long id;
		int NumberOfYearsOfExperience;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Accountant, WebDeveloper or MobileDeveloper to continue");

		switch (input.nextLine()) {
		case ("Accountant"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your NumberOfYearsOfExperience");
			NumberOfYearsOfExperience = input.nextInt();
			System.out.println("Enter Your LastDegree");
			String lastDegree = input.next();
			new Accountant(firstName, lastName, id, NumberOfYearsOfExperience, lastDegree).writeAccountantInfoToFile();
			break;

		case ("WebDeveloper"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your NumberOfYearsOfExperience");
			NumberOfYearsOfExperience = input.nextInt();
			System.out.println("Enter Your LastJobStatus");
			String lastJob = input.next();
			System.out.println("Enter Your Programming Language");
			String lang = input.next();
			new WebDeveloper(firstName, lastName, id, NumberOfYearsOfExperience, lastJob, lang).writeWebDeveloperInfoToFile();
			break;

		case ("MobileDeveloper"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your NumberOfYearsOfExperience");
			NumberOfYearsOfExperience = input.nextInt();
			System.out.println("Enter Your LastJobStatus");
			String lastjob = input.next();
			System.out.println("Enter Your NumberOfPublishedApp");
			int number = input.nextInt();
			new MobileDeveloper(firstName, lastName, id, NumberOfYearsOfExperience, lastjob, number).writeMobileDeveloperInfoToFile();
			break;
		}
		
		new MobileDeveloper().readMobileDeveloperInfoFromFile();
		
	}
}

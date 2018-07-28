
import java.util.Scanner;

public class YaraTechJavaTest {

	public static void main(String[] args) {
		Run();
	}
	
	public static void Run(){
		String firstName, lastName;
		Long id;
		int NumberOfYearsOfExperience;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for Accountant, 2 WebDeveloper or 3 MobileDeveloper to continue");

		switch (input.nextInt()) {
		case (1):
			System.out.println("Enter Your FirstName");
			firstName = input.next();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextLong();
			System.out.println("Enter Your NumberOfYearsOfExperience");
			NumberOfYearsOfExperience = input.nextInt();
			System.out.println("Enter Your LastDegree");
			String lastDegree = input.next();
			new Accountant(firstName, lastName, id, NumberOfYearsOfExperience, lastDegree).writeAccountantInfoToFile();
			Run();
			break;

		case (2):
			System.out.println("Enter Your FirstName");
			firstName = input.next();
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
			new WebDeveloper(firstName, lastName, id, NumberOfYearsOfExperience, lastJob, lang)
					.writeWebDeveloperInfoToFile();
			Run();
			break;

		case (3):
			System.out.println("Enter Your FirstName");
			firstName = input.next();
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
			new MobileDeveloper(firstName, lastName, id, NumberOfYearsOfExperience, lastjob, number)
					.writeMobileDeveloperInfoToFile();
			Run();
			break;
		}
	}

	public void readListOfMobileDevelopers() {
		new MobileDeveloper().readMobileDeveloperInfoFromFile();
	}

	public void readListOfWebDevelopers() {
		new WebDeveloper().readWebDeveloperInfoFromFile();
	}

	public void readListOfAccountants() {
		new Accountant().readAccountantInfoFromFile();
	}
}

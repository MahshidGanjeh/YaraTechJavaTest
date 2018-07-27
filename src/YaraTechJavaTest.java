import java.util.Scanner;

public class YaraTechJavaTest {

	public static void main(String[] args) {

		String firstName, lastName;
		int id, sabeghe;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter accountant, webDev or mobileDev to continiue");

		switch (input.nextLine()) {
		case ("accountant"):
			System.out.println("Enter Your FirstName");
			firstName = input.nextLine();
			System.out.println("Enter Your LastName");
			lastName = input.nextLine();
			System.out.println("Enter Your NationalId");
			id = input.nextInt();
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
			id = input.nextInt();
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
			id = input.nextInt();
			System.out.println("Enter Your SabegheKar");
			sabeghe = input.nextInt();
			System.out.println("Enter Your LastJob");
			String lastjob = input.next();
			System.out.println("Enter Your NumberOfPublishedApp");
			int number = input.nextInt();
			MobileDeveloper mobile = new MobileDeveloper(firstName, lastName, id, sabeghe, lastjob, number);
			break;

		}

	}

}

class Employee {

	String firstName;
	String lastName;
	int nationalId;
	int sabegheKar;

	public Employee(String fName, String lName, int id, int s) {
		firstName = fName;
		lastName = lName;
		nationalId = id;
		sabegheKar = s;
	}

}

class Accountant extends Employee {

	String lastDegree;

	public Accountant(String fName, String lName, int id, int sabeghe, String lastDegree) {
		super(fName, lName, id, sabeghe);
		this.lastDegree = lastDegree;
	}
}

class Developer extends Employee {

	String lastJobStaus;

	public Developer(String fName, String lName, int id, int sabeghe, String lastJob) {
		super(fName, lName, id, sabeghe);
		lastJobStaus = lastJob;
	}
}

class WebDeveloper extends Developer {
	String language;

	public WebDeveloper(String fName, String lName, int id, int sabeghe, String lastJob, String language) {
		super(fName, lName, id, sabeghe, lastJob);
		this.language = language;
	}
}

class MobileDeveloper extends Developer {
	int numberOfPublishedApps;

	public MobileDeveloper(String fName, String lName, int id, int sabeghe, String lastJob, int number) {
		super(fName, lName, id, sabeghe, lastJob);
		numberOfPublishedApps = number;
	}
}

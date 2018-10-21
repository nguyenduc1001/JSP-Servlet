package Manager;

import Objects.ExperienceCandidate;

public class Manager {

	public static int menu() {
		System.out.println("****** MENU ******");
		System.out.println("0. Experience");
		System.out.println("1. Fresher");
		System.out.println("2. Internship");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		int choice = Validation.checkInputExperianceType();
		return choice;
	}

	public static void createExperienceCandidate() {
		System.out.print("Enter first name: ");
		String firstName = Validation.checkInputString();
		System.out.print("Enter last name: ");
		String lastName = Validation.checkInputString();
		System.out.print("Enter birth date: ");
		String bd = Validation.checkInputBirthDate();
		int birthDate = Integer.parseInt(bd);
		System.out.print("Enter address: ");
		String address = Validation.checkInputString();
		System.out.print("Enter phone: ");
		String phone = Validation.checkInputPhone();
		System.out.print("Enter email: ");
		String email = Validation.checkInputEmail();
		System.out.print("Enter years of experiance: ");
		int z = Validation.checkExpInYear();
		System.out.print("Enter professional skill: ");
		String ps = Validation.checkInputString();
		ExperienceCandidate ec = new ExperienceCandidate(firstName, lastName, birthDate, address, phone, email, 0, z,
				ps);
		ec.toString();
	}

	public static void createFresherCandidate() {

	}

	public static void createInternCandidate() {

	}

}
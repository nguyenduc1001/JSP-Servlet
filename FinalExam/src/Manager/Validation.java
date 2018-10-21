package Manager;

import java.util.Scanner;

public class Validation {

	private final static Scanner input = new Scanner(System.in);
	private static final String BIRTHDATE_VALID = "(?:19|20)\\d\\d";
	private static final String PHONE_VALID = "^[0-9\\-\\+]{9,15}$";
	private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
	private static final String EXPINYEAR_VALID = "^[1-9]$|^[1-9][0-9]$|^(100)$";


	public static String checkInputString() {

		while (true) {
			String result = input.nextLine().trim();
			if (result.isEmpty()) {
				System.err.println("Not empty");
				System.out.print("Enter again: ");
			} else {
				return result;
			}
		}
	}

	public static int checkExpInYear() {

//		while (true)
//			try {
//				int result = Integer.parseInt(input.nextLine().trim());
//				if (result > 0 && result < 100) {
//					return result;
//				}
//			} catch (NumberFormatException e) {
//				System.err.println("Year of experiance must be number from (1-100), please try again  ");
//			}
//	}
		boolean checkInput = true;
		int ip = 0;

		do {
			try {
				ip = input.nextInt();
				if (ip > 0 && ip < 100) {
					checkInput = true;
				} else{				
					System.err.println("Year of experiance must be number from (1-100), please try again  ");
					checkInput = false;
					String ssad = input.nextLine();
				}
			} catch (Exception e) {
				checkInput = false;

			}
		} while (!checkInput);
		return ip;
	}

	public static boolean checkInputYN() {

		while (true) {
			String result = checkInputString();

			if (result.equalsIgnoreCase("Y")) {
				return true;
			} else if (result.equalsIgnoreCase("N")) {
				return false;
			}
			System.err.println("Please input y/Y or n/N.");
			System.out.print("Enter again: ");
		}
	}

	public static String checkInputBirthDate() {
		while (true) {
			String result = checkInputString();
			if (result.matches(BIRTHDATE_VALID)) {
				return result;
			} else {
				System.err.println("Birthdate is not correct. Please try again:");
			}
		}
	}

	public static String checkInputPhone() {
		while (true) {
			String result = checkInputString();
			if (result.matches(PHONE_VALID)) {
				return result;
			} else {
				System.err.println("Phone is not correct. Please try again:");
			}
		}
	}

	public static String checkInputEmail() {
		while (true) {
			String result = checkInputString();
			if (result.matches(EMAIL_VALID)) {
				return result;
			} else {
				System.err.println("The email address must be name>@<domain>, please try again");
			}
		}
	}

	public static String checkInputGraduationRank() {
		while (true) {
			String result = checkInputString();
			if (result.equalsIgnoreCase("Excellence") || result.equalsIgnoreCase("Good")
					|| result.equalsIgnoreCase("Fair") || result.equalsIgnoreCase("Poor")) {
				return result;
			} else {
				System.err.println("Please enter the Graduation Rank follow to: Excellence, Good, Fair, Poor");
			}
		}
	}

	public static int checkInputExperianceType() {
		while (true) {
			try {
				int result = Integer.parseInt(input.nextLine().trim());
				if (result == 0 || result == 1 || result == 2 || result == 3) {
					return result;
				}
			} catch (NumberFormatException e) {
				System.err.println("Experiance type is invalid, please try again");
				System.out.print("Enter again: ");
			}
		}
	}
}
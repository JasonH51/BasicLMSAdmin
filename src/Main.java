import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		Teacher teacher = new Teacher();

		boolean exit = false;

		printMenu();

		while (!exit) {
			System.out.println("Please select from the menu. Press 1 to see menu or 0 to quit program.");
			int input = s.nextInt();
			s.nextLine();

			switch (input) {
			case 1:
				printMenu();
				break;
			case 2:
				teacher.addStudents(s);
				break;
			case 3:
				teacher.setGrades(s);
				break;
			case 4:
				teacher.updateGradeBook(s);
				break;
			case 5:
				teacher.displayGradeBook(teacher.getGradeBook());
				break;
			case 6:
				teacher.displayGradeBook(teacher.getGraduatingClass());
				break;
			case 0:
				System.out.println("Good bye.");
				exit = true;
			}
		}

	}

	private static void printMenu() {
		System.out.println("Welcome to a new year! Lets get you started setting up your class. \n"
				+ "Select from the menu. \n " + "	1 - Show menu. \n" + "	2 - Add students to grade book. \n "
				+ "	3 - Set grades for each student. \n " + "	4 - Update one students grade. \n "
				+ " 	5 - Show grade book. \n " + " 	6 - Show graduating class \n" + " 	0 - Quit program.");
	}

}

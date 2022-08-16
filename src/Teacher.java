import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Administrators {

	private ArrayList<Student> gradebook = new ArrayList<Student>();

	@Override
	public boolean updateGradeBook(Scanner s) {
		System.out.println("Type in the students first name:");
		String firstName = s.nextLine();
		System.out.println("Type in the students last name:");
		String lastName = s.nextLine();
		System.out.println("Type in the students grade:");
		int grade = s.nextInt();
		int i = index(firstName, lastName);
		if (i >= 0) {
			gradebook.get(i).setGrade(grade);
			return true;
		}
		return false;
	}

	@Override
	public void addStudents(Scanner s) {
		boolean exit = false;

		while (!exit && gradebook.size() < 11) {
			System.out.println("Students registered " + gradebook.size() + " out of 10 max.");
			System.out.println("Type in the students first name:");
			String firstName = s.nextLine();
			System.out.println("Type in the students last name:");
			String lastName = s.nextLine();
			gradebook.add(new Student(firstName, lastName));
		}
	}

	private int index(String firstName, String lastName) {
		int index = -1;

		for (int i = 0; i < gradebook.size(); i++) {
			String studentFirstName = gradebook.get(i).getFirstName();
			String studentLastName = gradebook.get(i).getLastName();
			System.out.println("First name" + studentFirstName + " last name " + studentLastName);
			if (studentFirstName.equalsIgnoreCase(firstName) && studentLastName.equalsIgnoreCase(lastName)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void displayGradeBook(ArrayList<Student> gradebook) {
		for (int i = 0; i < gradebook.size(); i++) {
			Student student = gradebook.get(i);
			System.out.println("Student # " + i + " - " + student.getFirstName() + " " + student.getLastName()
					+ " Grade: " + student.getGrade());
		}
	}

	public void setGrades(Scanner s) {
		System.out.println("Lets set the grades of all the students.");
		for (int i = 0; i < gradebook.size(); i++) {
			Student student = gradebook.get(i);
			System.out.println("What grade do you want to set " + student.getFirstName() + " " + student.getLastName()
					+ "'s to? Enter grade:");
			int grade = s.nextInt();
			student.setGrade(grade);
		}
	}

	public ArrayList<Student> getGraduatingClass() {
		return super.graduatingClass(this.gradebook);
	}

	public ArrayList<Student> getGradeBook() {
		return this.gradebook;
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Administrators {
	
	
	public abstract boolean updateGradeBook(Scanner s);
	public abstract void addStudents(Scanner s);
	
	protected ArrayList<Student> graduatingClass(ArrayList<Student> students) {
		GraduatingClass graduatingClass = new GraduatingClass(students);
		return graduatingClass.getGraduatingClass();
	}
	
	private class GraduatingClass{
		private ArrayList<Student> graduatingClass = new ArrayList<Student>();
		
		public GraduatingClass(ArrayList<Student> students) {
			for(Student student : students) {
				add(student);
			}
		}

		public ArrayList<Student> getGraduatingClass() {
			return graduatingClass;
		}
		
		public void add(Student student) {
			if(student.getGrade() >= 70) {
				graduatingClass.add(student);
			}
		}
	}

}

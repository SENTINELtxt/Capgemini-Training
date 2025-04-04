package Objects;

public class Class {
	private int grade;
	private Student[] students = new Student[10];
	Class(int grades) {
		this.grade = grade;
	}
	public int getGrades() {
		return grade;
	}
	public Student[] getStudents() {
		return students;
	}
	int i = 0;
	void addStudent(String name) {
		Student s[i] = new Student(name);
		i++;
	}
	void display() {
		
	}

}

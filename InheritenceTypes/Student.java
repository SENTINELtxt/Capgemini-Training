package InheritenceTypes;

public class Student extends Person {
	int studentID;
	public void displayStudentsDetails() {
		System.out.println(this.studentID);
		
	}
	public int getID(int studentID) {
		return studentID;
	}
	public void setID(int studentID) {
		this.studentID = studentID;
	}
	Student(int studentID){
		this.studentID = studentID;
	}

}

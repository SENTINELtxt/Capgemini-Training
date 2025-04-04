package Comparable;
import java.util.*;

public class StudentDrriver {
	public static void main(String[] args) {
		Student[] students = {
				new Student(1,"Aritra",98.5),
				new Student(4,"Rajat",96.3),
				new Student(2,"Lash",90.75),
				new Student(3,"Ram",92.89),
				
		};
		Arrays.sort(students);
	
	for(Student student:students) {
		System.out.println(student);
	}
	}
}



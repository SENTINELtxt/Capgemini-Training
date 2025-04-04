package Comparable;

public class Student implements Comparable {
	int rollno;
	String name;
	double percentage;
	public Student(int rollno,String name,double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return rollno+ "\t" + name+"\t"+percentage;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		
		//return Double.compare(this.percentage, s.percentage);
		return this.name.compareTo(s.name);
	}

}

package ManyToMany;

public class Driver {
    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Lash", 3);
        Student student2 = new Student(2, "Rajat", 3);
        Student student3 = new Student(3, "Bhai", 3);

     
        Subject subject1 = new Subject(101, "Java", 3);
        Subject subject2 = new Subject(102, "Python", 3);
        Subject subject3 = new Subject(103, "C", 3);

        // Associate students with subjects
        student1.addSubject(subject1);
        student1.addSubject(subject2);

        student2.addSubject(subject1);
        student2.addSubject(subject3);

        student3.addSubject(subject2);
        student3.addSubject(subject3);

        // Associate subjects with students
        subject1.addStudent(student1);
        subject1.addStudent(student2);

        subject2.addStudent(student1);
        subject2.addStudent(student3);

        subject3.addStudent(student2);
        subject3.addStudent(student3);

        
        System.out.println(student1.getName() + " is enrolled in: ");
        for (Subject subject : student1.getSubjects()) {
            if (subject != null) {
                System.out.println(subject.getName());
            }
        }

        System.out.println(student2.getName() + " is enrolled in: ");
        for (Subject subject : student2.getSubjects()) {
            if (subject != null) {
                System.out.println(subject.getName());
            }
        }

        System.out.println(student3.getName() + " is enrolled in: ");
        for (Subject subject : student3.getSubjects()) {
            if (subject != null) {
                System.out.println(subject.getName());
            }
        }

       
        System.out.println(subject1.getName() + " has the following students: ");
        for (Student student : subject1.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }

        System.out.println(subject2.getName() + " has the following students: ");
        for (Student student : subject2.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }

        System.out.println(subject3.getName() + " has the following students: ");
        for (Student student : subject3.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
    }
}

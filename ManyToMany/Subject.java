package ManyToMany;

public class Subject {
    private int id;
    private String name;
    private Student[] students; 
    private int studentCount;  

    public Subject(int id, String name, int maxStudents) {
        this.id = id;
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot add more students to " + name);
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    public String toString() {
        return "Subject{id=" + id + ", name='" + name + "'}";
    }
}

package ManyToMany;

public class Student {
    private int id;
    private String name;
    private Subject[] subjects; 
    private int subjectCount;  

    public Student(int id, String name, int maxSubjects) {
        this.id = id;
        this.name = name;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }

    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount++] = subject;
        } else {
            System.out.println("Cannot add more subjects to " + name);
        }
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

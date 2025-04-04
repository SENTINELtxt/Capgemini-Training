package ObjectClass;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Ram", 85.5);
        Student student2 = new Student(101, "Ram", 85.5);
        Student student3 = new Student(102, "Rahim", 90.0);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));

        System.out.println("student1.hashCode(): " + student1.hashCode());
        System.out.println("student2.hashCode(): " + student2.hashCode());
        System.out.println("student3.hashCode(): " + student3.hashCode());
    }
}
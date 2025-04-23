package Employee2;
import java.util.*;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		  
//        Map<String, List<Employee>> employeesByCity = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getCity));
//
//        
//        employeesByCity.forEach((city, employees) -> {
//            System.out.println("\nEmployees in " + city + ":");
//            employees.forEach(System.out::println);
//        });
		

//        Map<Integer, List<Employee>> employeesByAge = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getAge));
//
//       
//        employeesByAge.forEach((age, employees) -> {
//            System.out.println("\nEmployees of age " + age + ":");
//            employees.forEach(System.out::println);
//        });
	       
//        Map<String, List<Employee>> employeesByDept = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getDeptName));
//
//       
//        employeesByDept.forEach((dept, employees) -> {
//            System.out.println("\nEmployees in Department " + dept + ":");
//            employees.forEach(System.out::println);
//        });
		
//        System.out.println("Employees with age greater than 28:");
//        empList.stream()
//                .filter(emp -> emp.getAge() > 28)
//                .forEach(System.out::println);
		
//		OptionalInt maxAge = empList.stream()
//		        .mapToInt(Employee::getAge)
//		        .max();
//
//		if (maxAge.isPresent()) {
//		    System.out.println("Maximum age of an employee: " + maxAge.getAsInt());
//		} else {
//		    System.out.println("Employee list is empty.");
//		}
		
		Optional<Employee> youngestFemale = empList.stream()
		        .filter(emp -> emp.getGender().equals("F"))
		        .min(Comparator.comparingInt(Employee::getAge));

		if (youngestFemale.isPresent()) {
		    System.out.println("Youngest female employee: " + youngestFemale.get());
		} else {
		    System.out.println("No female employees found.");
		}
		
		
		
		

		
	}

}

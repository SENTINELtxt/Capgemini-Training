package Exception;

import java.util.Scanner;

public class Eligibility {
	public static void ageChecker(int age) {
		if(age>=21) {
			System.out.println("Get married");
		}else {
			throw new InvalidAge();
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		ageChecker(age);
	}

}

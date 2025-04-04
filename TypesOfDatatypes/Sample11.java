package TypesOfDatatypes;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b= sc.nextDouble();
		double c = sc.nextDouble();		char ch = sc.next().charAt(0);
		if(ch=='+') {
			System.out.println(a+b);
		}
		else if(ch=='-') {
			System.out.println(a-b);
		}
		else if(ch=='*') {
			System.out.println(a*b);
		}
		else if(ch=='/') {
			System.out.println(a/b);
		}
		else {
			System.out.println("Not valid");
		}
	}

}

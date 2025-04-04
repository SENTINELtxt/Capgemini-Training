package TypesOfDatatypes;

import java.util.Scanner;

public class Sample12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b= sc.nextDouble();
		double c = sc.nextDouble();
		if(a>b && a>c) {
			System.out.println(a+"is Greatest");
		}
		else if(b>a && b>c) {
			System.out.println(b+"is greatest");
		}
		else if(c>a && c>b){
			System.out.println(c+"is greatest");
		}
		else {
			System.out.println("All are equal");
		}
	}

}

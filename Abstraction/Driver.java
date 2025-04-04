package Abstraction;

public class Driver {
	public static void main(String[] args) {
		Calci c = new Implementation();
		System.out.println(c.add(5, 6));
		System.out.println(c.sub(8, 2));
		System.out.println(c.mul(2, 4));
	}

}

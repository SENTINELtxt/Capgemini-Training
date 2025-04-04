package ObjectOverloading;

public class Child extends Parent {
	String name = "Ronaldo";
	void display() {
		String name = "Local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	

}

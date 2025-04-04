package Objects;

public class CalciDriver {
	public static void main(String[] args) {
		Calculator c = new Calculator(10,5);
		Calculator.add(c).multiply(c);
		System.out.println(c.getResult());
	}
	

}

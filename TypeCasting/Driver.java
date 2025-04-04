package TypeCasting;


class A {}
class B extends A{}
class C extends A{}
class D extends C{}
class E{}

public class Driver{
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B );
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		
;
		
	}
}


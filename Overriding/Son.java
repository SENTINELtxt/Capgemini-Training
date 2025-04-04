package Overriding;

public class Son extends Father{
	@Override
	Father create() {
		return new Son();
	}
	

}

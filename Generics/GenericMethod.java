package Generics;

public class GenericMethod {
	static public<T> void printArray(T[] arr) {
		for(T i : arr) {
			System.out.println(i+"\t");
		}
		
	}
	public static void main(String[] args) {
		Double[] arr = {25.5,89.3,4.6,8.9};
		printArray(arr);
		
	}

}

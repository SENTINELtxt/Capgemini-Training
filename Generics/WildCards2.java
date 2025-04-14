package Generics;
import java.util.*;

public class WildCards2 {
	public static<T> void printLinkedList(LinkedList<?> list) {
		
		for(Object i : list) {
			System.out.println(i+"\t");
		}
		Object i = list.get(0);
	}
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		printLinkedList(list1);
	}

}

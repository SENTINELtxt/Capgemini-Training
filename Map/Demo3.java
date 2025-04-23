package Map;
import java.util.*;

public class Demo3 {
	public static void main(String[] args) {
		TreeMap<Integer,String> h = new TreeMap<Integer,String>();
		h.put(3,"Oblash");
		h.put(1,"Aritra");
		h.put(5,"Rajat");
		h.put(2,"Bhai");
		h.put(4,"Bhargab");
		System.out.println(h);
		Set<Integer> key_set = h.keySet();
		for(int key:key_set) {
			System.out.println(key+"\t"+h.get(key));
		}
	}
}

		
		
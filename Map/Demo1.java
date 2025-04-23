package Map;
import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(1, "Bhargab");
		h.put(2, "Rajat");
		h.put(5, "Oblash");
		h.put(3, "Aritra");
		h.put(6, "Bhai");
		h.remove(1,"Zoo");
		System.out.println(h);
		Set<Integer> key_set = h.keySet();
		for(int key: key_set) {
			System.out.println(key+"\t"+h.get(key));
		}
		
		
	}

}

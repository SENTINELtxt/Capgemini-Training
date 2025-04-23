package StreamAPI;
import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,5,3,1,6,7);
		List<Integer> res = list.stream().skip(2).toList();
		System.out.println(res);
	} 
	

}

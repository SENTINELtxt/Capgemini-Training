package StreamAPI;

import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(2,6,8,7,2,6,3) ;
//		List<Integer> res = new ArrayList<Integer>();
//		for(Integer i : list) {
//			if(i%2==0)
//				res.add(i);
//		}
//		System.out.println(res);
		List<Integer> res = list.stream().filter(i -> i%2 ==0).toList();
		System.out.println(res);
		
		List<Integer> res2 = list.stream().map(i -> i*2).toList();
		System.out.println(res2);
	}

	

}

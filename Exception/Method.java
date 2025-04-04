package Exception;

import TypesOfDatatypes.Main;

public class Method {
	public static int demo(){
		try {
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally {
			return 3;
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println(demo());
		
	}

}

package TypesOfDatatypes;
import java.util.*;
public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int t = no;
		int d = 0;
		int o= 1;
		int e = 1;
		while(t>0) {
			d = t%10;
			if(d%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
			t = t/10;
		
		
			
		}
		System.out.println(e*o);
	}

}

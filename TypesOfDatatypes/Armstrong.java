package TypesOfDatatypes;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int t = no;
		int t1 = no;
		int s =0;
		int c = 0;
		int d = 0;
		while(t>0)
		{
			
			c++;
			t=t/10;
		}
		while(t1>0)
		{
			d = t1%10;
			s = s+ (int)Math.pow(d,c);
			t1 = t1/10;
		}
		if (s==no)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}

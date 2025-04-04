package TypesOfDatatypes;
import java.util.*;

public class Ceiling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        
       
        int a[] = new int[7];
        
        
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter a number to search");
        int no = sc.nextInt();
        
       
        Arrays.sort(a);
        
        
        int index = Arrays.binarySearch(a, no);
        
       
        if (index >= 0) {
            System.out.println("Floor of " + no + " is: " + a[index]);
        } else {
        	 int insertPoint = -(index + 1);
            
            
            if (insertPoint < a.length) {
                System.out.println("Floor of " + no + " is: " + a[insertPoint-1]);
            } else {
                System.out.println("No Floor found. The number is smaller than any element in the array.");
            }
        }
    }
}

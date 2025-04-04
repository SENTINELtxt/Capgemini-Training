package TypesOfDatatypes;
import java.util.*;

public class Binary {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70}; 
        int no = 20; 
        
        int low = 0; 
        int up = a.length - 1;  // End index
        
        while (low <= up) {
            int mid = low + (up - low) / 2;  // Calculate middle index
            
            if (a[mid] == no) {  // Element found
                System.out.println("Found at index: " + mid);
                return;  // Exit the function after finding the element
            } else if (a[mid] > no) {  // Search in the left half
                up = mid - 1;
            } else {  // Search in the right half
                low = mid + 1;
            }
        }
        
        System.out.println("Element not found");
    }
}

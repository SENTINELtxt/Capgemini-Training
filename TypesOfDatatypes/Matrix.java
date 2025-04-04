package TypesOfDatatypes;
import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int a[][] = {{3,1,2},{4,9,5},{8,1,3}};
        
        
        System.out.println("Sum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0; 
            for (int j = 0; j < 3; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
        }

        
        System.out.println("Sum of each column:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0; 
            for (int i = 0; i < 3; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }
    }
}

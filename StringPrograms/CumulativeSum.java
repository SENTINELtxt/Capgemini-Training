package StringPrograms;

import java.util.*;
public class CumulativeSum{

   
   public static void main(String[] args) {
      int sum = 0;
      
      
      int numbers[] = {1,2,3,4};
      
      
      for (int i = 0; i < numbers.length; i++) {
      
         
         sum += numbers[i];
         
         
         numbers[i] = sum; 
      }
      
      //printing the result
      System.out.println("Cumulative sum is ");
      System.out.println(Arrays.toString(numbers));
   }
}
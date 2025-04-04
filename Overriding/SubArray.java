package Overriding;
import java.util.*;

class SubArray {
    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        
        int[] nums = new int[n];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        
        int result = maxSubArray(nums);
        System.out.println("The maximum sum of the subarray is: " + result);
        
        
        sc.close();
    }
}



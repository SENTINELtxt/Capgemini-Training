package StringPrograms;

//Java Program to Count the Occurrences of Each Character Using HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurence {
 public static void main(String[] args) {
     // Step 1: Read the string from the user
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Enter a string: ");
         String input = scanner.nextLine();
         
        
         Map<Character, Integer> charCountMap = new HashMap<>();
         
        
         for (char ch : input.toCharArray()) {
             charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
         }
         
         
         System.out.println("Character occurrences:");
         for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
     }
 }
}
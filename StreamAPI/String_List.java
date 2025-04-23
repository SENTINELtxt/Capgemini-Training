package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class String_List {
    public static void main(String[] args) {
        
        List<String> stringList = Arrays.asList("apple", "banana", "guava", "cherry", "mango");

        
        List<String> upperCaseList = stringList.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

  
        System.out.println("Uppercase List: " + upperCaseList);
        String res = list.stream().filter(s -> s.charAt(0) == 'a' ).findFirst().get();
    }
}
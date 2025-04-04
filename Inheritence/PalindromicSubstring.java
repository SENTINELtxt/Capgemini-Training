package Inheritence;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        
        System.out.println(countPalindromicSubstrings(s1)); 
        System.out.println(countPalindromicSubstrings(s2)); 
    }

    public static int countPalindromicSubstrings(String s) {
        int count = 0;
        int n = s.length();

        
        for (int center = 0; center < n; center++) {
            count += expandAroundCenter(s, center, center); 
            count += expandAroundCenter(s, center, center + 1); 
        }

        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
package TypesOfDatatypes;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int t = no;
        int s = 0;
        int d = 0;

        while (t > 0) {
            d = t % 10;
            s = s * 10 + d;
            t = t / 10;
        }

        if (Palin(no, s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean Palin(int no, int s) {
        if (s == no) {
            return true;
        } else {
            return false;
        }
    }
}

package Exception;

public class Array {
    public static void main(String[] args) {
        int a[] = {4,6,8,9,1,2,7};
        String str = null;

        try {
            
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

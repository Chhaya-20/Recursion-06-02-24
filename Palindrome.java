import java.util.*;

public class Palindrome {

    static boolean pal(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return pal(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        System.out.println(pal(s, 0, s.length() - 1));
        sc.close();
    }

}

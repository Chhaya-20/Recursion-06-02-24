import java.util.*;

public class StringCheck {

    public static boolean solve(String s, int i) {
        if (i == s.length())
            return true;

        if (i == 0) {
            if (s.charAt(i) != 'a') {
                return false;
            }
        }

        if (s.charAt(i) == 'a') {
            if (i + 1 < s.length() && s.charAt(i + 1) == 'b') {
                if (i + 2 < s.length() && s.charAt(i + 2) != 'b') {
                    return false;
                } else if (i + 2 == s.length()) {
                    return false;
                }
            }
        }

        return solve(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the String");
        String s = sc.next();

        boolean ans = solve(s, 0);
        System.out.println(ans);

        sc.close();

    }

}

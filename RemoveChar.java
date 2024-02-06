import java.util.*;

public class RemoveChar {

    static String remove(String s, int i, int j, String ans) {

        if (i == j) {
            return ans;

        }
        int n = ans.length() - 1;
        if (ans.charAt(n) == s.charAt(i)) {
            ans = ans + '*';
        } else {
            ans = ans + s.charAt(i);
        }
        return remove(s, i + 1, j, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        String ans = "";
        ans = ans + s.charAt(0);
        System.out.println("Output String is " + remove(s, 1, s.length(), ans));
        sc.close();
    }

}

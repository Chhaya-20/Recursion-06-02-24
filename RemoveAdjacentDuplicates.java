import java.util.*;

public class RemoveAdjacentDuplicates {
    static void remove(String s, int i, int j, StringBuilder ans) {
        if (i == j) {
            return;
        }

        if (!ans.isEmpty() && s.charAt(i) == ans.charAt(ans.length() - 1)) {

            if (i < j - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    remove(s, i + 1, j, ans);
                } else {
                    ans.deleteCharAt(ans.length() - 1);
                    remove(s, i + 1, j, ans);
                }
            } else {

                ans.deleteCharAt(ans.length() - 1);
                remove(s, i + 1, j, ans);
            }

        } else {
            ans.append(s.charAt(i));
            remove(s, i + 1, j, ans);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        // String s = "acaaabbbacdddd";
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        // ans = ans + s.charAt(0);
        remove(s, 1, s.length(), ans);
        System.out.println("Output String is " + ans);
        sc.close();
    }

}

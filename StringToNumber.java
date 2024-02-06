import java.util.*;

public class StringToNumber {
    static int convert(String s, int i, int j, int ans) {
        // System.out.println("ans is " + ans);

        if (i == j) {

            return ans * 10 + s.charAt(i) - '0';

        }
        int a = s.charAt(i) - '0';
        ans = ans * 10 + a;
        return convert(s, i + 1, j, ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        int ans = 0;
        System.out.println("Output Intger is ");
        System.out.println(convert(s, 0, s.length() - 1, ans));
        sc.close();

    }

}

import java.util.*;

public class LongestSequence {

    static int sequence(int[] a, int i, int j) {
        if (i == j) {
            return 0;
        }
        int op1 = 0;
        if (i != 0) {
            if (a[i] > a[i - 1]) {
                op1 = 1 + sequence(a, i + 1, a.length - 1);

            }
        } else {
            op1 = 1 + sequence(a, i + 1, a.length - 1);
        }

        int op2 = sequence(a, i + 1, a.length - 1);

        return Math.max(op1, op2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elememnts ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        // Approach 1
        // int[] lis = new int[n];
        // for (int i = 0; i < n; i++) {
        // lis[i] = 1;
        // }
        // int ans = 1;
        // for (int i = 1; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // if (a[j] < a[i] && lis[i] < lis[j] + 1) {

        // lis[i] = lis[j] + 1;

        // }
        // }
        // ans = Math.max(ans, lis[i]);

        // }
        // System.out.println("Length is " + ans);

        // APPROACH 2
        System.out.println("Length is " + sequence(a, 0, a.length - 1));
        sc.close();
    }

}

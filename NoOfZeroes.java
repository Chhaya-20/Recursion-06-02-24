import java.util.*;

public class NoOfZeroes {
    static int zeroes(int n) {
        // System.out.println(n);
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 0) {
            // System.out.println("iffff");
            return 1 + zeroes(n / 10);
        } else {
            // System.out.println("elseee");
            return zeroes(n / 10);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no ");
        int n = sc.nextInt();
        System.out.println("NO OF ZEROES ARE " + zeroes(n));
        sc.close();
    }

}

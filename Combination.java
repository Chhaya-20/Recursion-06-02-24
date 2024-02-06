import java.util.*;

public class Combination {
    static int fact(int n) {
        if (n == 0)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = sc.nextInt();
        System.out.println("Enter value of r ");
        int r = sc.nextInt();
        int g = fact(n);
        int h = fact(r) * fact(n - r);
        System.out.println("Ans is " + (g / h));
        sc.close();

    }

}

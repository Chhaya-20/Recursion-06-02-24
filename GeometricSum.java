import java.util.*;

public class GeometricSum {
    static double sum(int n, int i) {
        if (i == n) {
            return 1 / (double) Math.pow(2, i);
        }
        return 1 / (double) Math.pow(2, i) + sum(n, i + 1);
        // return sum(n, i + 1) + (1 / 2 ^ i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        System.out.println(sum(n, 0));
        sc.close();
    }

}

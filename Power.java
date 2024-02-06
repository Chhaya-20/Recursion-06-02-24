import java.util.Scanner;

public class Power {
    public static int Pow(int r, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return (Pow(r * r, n / 2)) % (int) 10e9;
        }
        return (r * Pow(r * r, (n - 1) / 2)) % (int) 10e9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        int r = sc.nextInt();
        System.out.println("Enter power ");
        int n = sc.nextInt();
        System.out.println(Pow(r, n));
        sc.close();
    }
}

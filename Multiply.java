import java.util.*;

public class Multiply {

    static int product(int a, int b) {
        if (b == 1)
            return a;
        else if (a == 1) {
            return b;
        }
        return (a + product(a, b - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no ");
        int a = sc.nextInt();
        System.out.println("Enter second no ");
        int b = sc.nextInt();
        System.out.println("product of two no. are " + product(a, b));
        sc.close();

    }

}

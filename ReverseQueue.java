import java.util.*;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int data = q.peek();
        q.remove();

        // Reverse remaining queue
        reverse(q);

        // Enqueue current item (to rear)
        q.add(data);

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Before reverse" + q);
        reverse(q);
        System.out.println("After reverse" + q);
        sc.close();

    }

}

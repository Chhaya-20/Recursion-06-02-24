import java.util.*;

public class SortStack {

    public static void Sort(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }
        int x = st.pop();
        Sort(st);
        Stack<Integer> temp = new Stack<>();
        while (!st.empty() && st.peek() > x) {
            temp.push(st.pop());
        }
        st.push(x);
        while (!temp.empty()) {
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        Sort(st);
        System.out.println("Sorted Stack is " + st);
        sc.close();
    }

}

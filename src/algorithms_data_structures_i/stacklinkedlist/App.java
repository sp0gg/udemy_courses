package algorithms_data_structures_i.stacklinkedlist;

/**
 * Created by sp0gg on 9/25/16.
 */
public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(100);
        stack.push(1000);

        System.out.println(stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());
    }
}

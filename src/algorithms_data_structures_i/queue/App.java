package algorithms_data_structures_i.queue;

/**
 * Created by sp0gg on 10/4/16.
 */
public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(10);
        queue.enqueue(120);
        queue.enqueue(130);
        queue.enqueue(140);
        queue.enqueue(150);
        queue.enqueue(160);

        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

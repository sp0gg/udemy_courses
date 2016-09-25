package algorithms_data_structures_i.linkedlist;

/**
 * Created by sp0gg on 9/25/16.
 */
public class App {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        list.insert(10);
        list.insert(-2);
        list.insert(3);
        list.insert(100);
        list.insert(150);

        list.remove(1030);

        System.out.println(list.size());

        list.traverseList();
    }
}

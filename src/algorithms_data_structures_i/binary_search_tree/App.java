package algorithms_data_structures_i.binary_search_tree;

/**
 * Created by sp0gg on 10/9/16.
 */
public class App {
    public static void main(String[] args) {
        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        bst.insert(25);
        bst.insert(5);
        bst.insert(-1);
        bst.insert(10);
        bst.insert(15);
        bst.insert(80);
        bst.insert(0);

        System.out.println(bst.getMax());
        System.out.println(bst.getMin());
        System.out.println("traversing...");
        bst.traverse();
        System.out.println("searching...");
        System.out.println(bst.search(25));
        System.out.println(bst.search(80));
        System.out.println(bst.search(876876));
    }


}

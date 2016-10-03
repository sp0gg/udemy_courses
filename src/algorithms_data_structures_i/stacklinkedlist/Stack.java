package algorithms_data_structures_i.stacklinkedlist;

/**
 * Created by sp0gg on 9/25/16.
 */
public class Stack<T extends Comparable<T>> {
    private Node<T> root;
    private int count;

    //O(1)
    public void push(T newData) {
        if (this.root == null) {
            this.root = new Node<T>(newData);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<T>(newData);
            this.root.setNextNode(oldRoot);
        }
        this.count++;
    }

    //O(1)
    public T pop() {
        Node<T> itemToPop = this.root;
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop.getData();
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    //O(1)
    public T peek() {
        return this.root.getData();
    }
}

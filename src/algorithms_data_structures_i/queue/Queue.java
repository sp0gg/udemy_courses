package algorithms_data_structures_i.queue;

/**
 * Created by sp0gg on 10/4/16.
 */
public class Queue<T extends Comparable<T>> {

    private Node<T> topNode;
    private Node<T> bottomNode;
    private int count;

    public boolean isEmpty(){
        return this.bottomNode == null;
    }

    public int size() {
        return this.count;
    }

    //O(1)
    public void enqueue(T newData) {
        Node<T> previousTopNode = this.topNode;
        this.topNode = new Node<T>(newData);
        this.topNode.setNextNode(null);

        if (isEmpty()) {
            this.bottomNode = this.topNode;
        } else {
            previousTopNode.setNextNode(topNode);
        }
        this.count++;
    }

    //O(1)
    public T dequeue(){
        Node<T> selectedNode = this.bottomNode;
        this.bottomNode = this.bottomNode.getNextNode();

        if (this.isEmpty()) {
            this.bottomNode = null;
        }

        count--;

        return selectedNode.getData();
    }
}

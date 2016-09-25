package algorithms_data_structures_i.linkedlist;

/**
 * Created by sp0gg on 9/25/16.
 */
public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int sizeOfList;

    public void insert(T data) {
        ++this.sizeOfList;
        if (root == null) {
            this.root = new Node<T>(data);
        }else{
            insertDataBeginning(data);
        }
    }

    //O(1)
    private void insertDataBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    //O(N)
    private void insertDataEnd(T data, Node<T> node){
        if(node.getNextNode() != null){
            insertDataEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<T>(data);
            node.setNextNode(newNode);
        }
    }

    public void remove(T data) {
        if (this.root == null) {
            return;
        }

        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        }else{
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> currentNode) {

        while (currentNode != null) {
            if (currentNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                --this.sizeOfList;
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    public void traverseList() {
        if (this.root == null) {
            return;
        }

        Node<T> currentNode = this.root;
        StringBuilder sb = new StringBuilder("");
        while (currentNode != null) {
            sb.append(currentNode.toString());
            sb.append(" -> ");
            currentNode = currentNode.getNextNode();
        }

        System.out.println(sb.toString());


    }

    public int size() {
        return this.sizeOfList;
    }
}

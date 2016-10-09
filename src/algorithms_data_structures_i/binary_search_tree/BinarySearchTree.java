package algorithms_data_structures_i.binary_search_tree;

/**
 * Created by sp0gg on 10/9/16.
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    public void traverse() {

    }

    public void insertNode(T insertionData, Node<T> node){
        if (insertionData.compareTo(node.getData()) < 0) {
            if (node.hasLeftChildNode()) {
                insertNode(insertionData, node.getLeftChild());
            }else{
                node.setLeftChild(new Node<>(insertionData));
            }
        } else if (insertionData.compareTo(node.getData()) > 0) {
            if (node.hasRightChildNode()) {
                insertNode(insertionData, node.getRightChild());
            }else{
                node.setRightChild(new Node<>(insertionData));
            }
        }
    }

    public void insert(T data) {
        if(root == null){
            root = new Node<>(data);
        } else {
            insertNode(data, root);
        }
    }

    public void delete(T data) {

    }

    public T getMax() {
        return null;
    }

    public T getMin() {
        return null;
    }
}

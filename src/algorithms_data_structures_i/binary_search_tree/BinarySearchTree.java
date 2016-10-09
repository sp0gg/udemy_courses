package algorithms_data_structures_i.binary_search_tree;

/**
 * Created by sp0gg on 10/9/16.
 */
class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    public void traverse() {

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
        if(!root.hasRightChildNode()){
            return root.getData();
        }else{
            return getRightNode(root.getRightChild());
        }
    }

    public T getMin() {
        if(!root.hasLeftChildNode()){
            return root.getData();
        }else{
            return getLeftNode(root.getLeftChild());
        }
    }

    private T getRightNode(Node<T> node) {
        if (node.hasRightChildNode()) {
            return getRightNode(node.getRightChild());
        }else{
            return node.getData();
        }
    }

    private T getLeftNode(Node<T> node) {
        if (node.hasLeftChildNode()) {
            return getLeftNode(node.getLeftChild());
        }else{
            return node.getData();
        }
    }

    private void insertNode(T insertionData, Node<T> node){
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
}

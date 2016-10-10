package algorithms_data_structures_i.binary_search_tree;

/**
 * Created by sp0gg on 10/9/16.
 */
class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    public void traverse() {
        Node<T> minNode = this.getMin();

        //getminnode - start point

        //check left node - if exists, pass in self
        //print parent
        //check right node - if exists, pass in self
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

    public Node<T> getMax() {
        if(!root.hasRightChildNode()){
            return root;
        }else{
            return getRightNode(root.getRightChild());
        }
    }

    public Node<T> getMin() {
        if(!root.hasLeftChildNode()){
            return root;
        }else{
            return getLeftNode(root.getLeftChild());
        }
    }

    private Node<T> getRightNode(Node<T> node) {
        if (node.hasRightChildNode()) {
            return getRightNode(node.getRightChild());
        }else{
            return node;
        }
    }

    private Node<T> getLeftNode(Node<T> node) {
        if (node.hasLeftChildNode()) {
            return getLeftNode(node.getLeftChild());
        }else{
            return node;
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

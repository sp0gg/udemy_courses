package algorithms_data_structures_i.binary_search_tree;

/**
 * Created by sp0gg on 10/9/16.
 */
public interface Tree<T> {
    public void insert(T data);
    public void delete(T data);
    public Node search(T data);
    public void traverse();
    public Node getMax();
    public Node getMin();
}

package algorithms_data_structures_i.shunting_yard_algorithm;

/**
 * Created by sp0gg on 10/3/16.
 */
public class App {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();

        algo.interpretExpressions("( ( 1 + 2 ) * ( 2 + 1 ) )");
        algo.printResult();
    }
}

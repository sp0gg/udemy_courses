package algorithms_data_structures_i.shunting_yard_algorithm;

import java.util.Stack;

/**
 * Created by sp0gg on 10/3/16.
 */
public class Algorithm {

    private Stack<String> operations;
    private Stack<Double> values;

    public Algorithm(){
        this.operations = new Stack<String>();
        this.values = new Stack<Double>();
    }

    public void interpretExpressions(String expression){
        String[] symbols = expression.split(" ");

        for (String symbol : symbols) {
            if (symbol.equals("(")) {

            } else if (symbol.equals("+")) {
                    this.operations.push(symbol);
            } else if (symbol.equals("*")) {
                   this.operations.push(symbol);
            } else if (symbol.equals(")")) {

                    String operation = this.operations.pop();

                    if (operation.equals("+")) {
                        this.values.push(this.values.pop() + this.values.pop());
                    } else if (operation.equals("*")) {
                        this.values.push(this.values.pop() * this.values.pop());
                    }
                } else {
                    this.values.push(Double.parseDouble(symbol));
                }
            }
        }
    public void printResult() {
        System.out.println(this.values.pop());
    }
}

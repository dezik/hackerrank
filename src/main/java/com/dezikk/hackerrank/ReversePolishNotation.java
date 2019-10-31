package com.dezikk.hackerrank;

import java.util.Stack;

public class ReversePolishNotation {
    public static Double calculate(String input) {
        if (input.length() == 0) return 0d;
        Stack<Double> stack = new Stack<>();
        for (String value : input.split("\\s")) {
            Double a, b;
            switch (value) {
                case "+": {
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
                case "-": {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a - b);
                    break;
                }
                case "*": {
                    stack.push(stack.pop() * stack.pop());
                    break;
                }
                case "/": {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                }
                default:
                    stack.push(Double.parseDouble(value));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculate("10 6 9 3 + -11 * / * 17 + 5 +"));
    }
}

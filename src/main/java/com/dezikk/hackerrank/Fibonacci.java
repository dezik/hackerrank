package com.dezikk.hackerrank;

public class Fibonacci {

    public String printFibonacciSequence(int length) {
        if (length == 1) return "0";
        if (length == 2) return "0 1";
        long a = 0;
        long b = 1;
        StringBuffer sb = new StringBuffer("0 1");
        for (int i = 3; i <= length; i++) {
            b = a + b;
            a = b - a;
            sb.append(" ").append(b);
        }
        return sb.toString();
    }
}

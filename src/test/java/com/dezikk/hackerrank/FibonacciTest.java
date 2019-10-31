package com.dezikk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testPrintFibonacciSequence() {
        String result = fibonacci.printFibonacciSequence(10);
        Assertions.assertEquals("0 1 1 2 3 5 8 13 21 34", result);
    }
}
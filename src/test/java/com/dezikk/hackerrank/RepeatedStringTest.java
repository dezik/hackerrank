package com.dezikk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedStringTest {

    @Test
    void testRepeatedString() {
        long result = RepeatedString.repeatedString("aba", 10L);
        Assertions.assertEquals(7L, result);
    }

    @Test
    void testRepeatedString2() {
        long result = RepeatedString.repeatedString2("aba", 10L);
        Assertions.assertEquals(7L, result);
    }
}

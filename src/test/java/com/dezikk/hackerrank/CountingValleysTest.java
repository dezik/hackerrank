package com.dezikk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingValleysTest {

    @Test
    void testCountingValleys() {
        int result = CountingValleys.countingValleys(8, "UDDDUDUU");
        Assertions.assertEquals(1, result);
    }

    @Test
    void testCountingValleys2() {
        int result = CountingValleys.countingValleys(12, "DDUUDDUDUUUD");
        Assertions.assertEquals(2, result);
    }
}


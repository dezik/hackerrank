package com.dezikk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpingOnTheCloudsTest {

    @Test
    void testJumpingOnClouds() {
        int result = JumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0});
        Assertions.assertEquals(4, result);
    }

    @Test
    void testJumpingOnClouds2() {
        int result = JumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0});
        Assertions.assertEquals(3, result);
    }
}
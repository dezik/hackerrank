package com.dezikk.hackerrank;

public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        for (int i = 1; i < c.length; i++) {
            if ((i + 1 < c.length) && c[i + 1] == 0) {
                steps++;
                i++;
                continue;
            }
            if (c[i] == 0) {
                steps++;
            }
        }
        return steps;
    }
}

package com.dezikk.hackerrank;

public class CountingValleys {
    static int countingValleys(int n, String s) {
        int count = 0;
        int level = 0;
        int prevLevel = 0;
        for (byte aByte : s.getBytes()) {
            if (aByte == 'D') {
                prevLevel = level;
                --level;
            } else if (aByte == 'U'){
                prevLevel = level;
                ++level;
            }
            if (level == 0 && prevLevel < 0) {
                count++;
            }
        }
        return count;
    }
}

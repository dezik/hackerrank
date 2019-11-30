package com.dezikk.hackerrank;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        if (s.equals("a")) return n;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i % s.length()) == 'a') count++;
        }
        return count;
    }

    static long repeatedString2(String s, long n) {
        if (s.isEmpty()) return 0;
        if (s.equals("a")) return n;
        long multiplicator = n / s.length();
        long rest = n % s.length();

        return countA(s) * multiplicator + countA(s.substring(0, (int) rest));
    }

    static long countA(String s) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }
        return count;
    }
}

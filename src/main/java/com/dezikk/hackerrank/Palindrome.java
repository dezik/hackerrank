package com.dezikk.hackerrank;

public class Palindrome {
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase().replace("\\W", "");
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("adada"));
    }
}

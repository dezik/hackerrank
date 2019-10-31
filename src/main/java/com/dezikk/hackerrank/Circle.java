package com.dezikk.hackerrank;

public class Circle {
    public static void drawCircle(int radius) {
        for (int i = 0; i <= radius + radius; i++) {
            for (int j = 1; j <= 2 * radius + 1; j++) {
                int xSquared = (i - radius) * (i - radius);
                int ySquared = (j - radius - 1) * (j - radius - 1);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("0");
                } else {
                    System.out.print("..");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawCircle(5);
    }
}

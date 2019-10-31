package com.dezikk.hackerrank;

public class ValidSquare {
    public static boolean validateSquare(Point p1, Point p2, Point p3, Point p4) {
        double a = getLength(p1, p2);
        double b = getLength(p1, p3);
        double c = getLength(p2, p4);
        double d = getLength(p3, p4);
        double diag = getLength(p1, p4);
        return a == b && b == c && c == d &&
                Math.abs(diag * diag - ((b * b) + (d * d))) <= 0.0001;
    }

    public static void main(String[] args) {
        System.out.println(validateSquare(
                new Point(0, 0),
                new Point(5, 0),
                new Point(0, 5),
                new Point(5, 5)
        ));
    }

    public static double getLength(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

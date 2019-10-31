package com.dezikk.hackerrank;

public class Square {
    public static void main(String[] args) {
        Square square = new Square();
        square.printSquare(10);
    }

    public void printSquare(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == sideLength - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

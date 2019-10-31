package com.dezikk.hackerrank;

public class Singleton {
    private static Singleton singleton;
    public double rand;

    private Singleton() {
        rand = Math.random();
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        single1.rand = 13123.4;
        System.out.println(single1 == single2);
        System.out.println(single1.rand == single2.rand);
    }
}

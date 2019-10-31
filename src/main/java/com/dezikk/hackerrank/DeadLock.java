package com.dezikk.hackerrank;

public class DeadLock {
    private final Object a = new Object();
    private final Object b = new Object();

    private Runnable first = () -> {
        synchronized (a) {
            System.out.println("lockA1");
            synchronized (b) {
                System.out.println("lockA2");
            }
        }
    };

    private Runnable second = () -> {
        synchronized (b) {
            System.out.println("lockB1");
            synchronized (a) {
                System.out.println("lockB2");
            }
        }
    };

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock.first).start();
        new Thread(deadLock.second).start();
    }
}

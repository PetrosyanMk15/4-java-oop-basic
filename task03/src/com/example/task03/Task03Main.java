package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(1, 2);
        Complex c = a.add(b);
        System.out.println("a + b = " + c);
        c = a.mult(b);
        System.out.println("a * b = " + c);
    }
}
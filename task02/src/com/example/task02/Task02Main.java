package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(3, 50, 33);
        System.out.println(t1);

        t1.setHours(15);
        System.out.println(t1.getHours());

        t1.setSeconds(20);
        System.out.println(t1.getSeconds());

        System.out.println(t1);

        TimeSpan t2 = new TimeSpan();
        t1.add(t2);
        System.out.println(t1);

        t2.setHours(3);
        t2.setSeconds(15);
        System.out.println(t2);

        t1.add(t2);
        System.out.println("Add: " + t1);

        t1.subtract(t2);
        System.out.println("Sub: " + t1);

    }
}

package com.kenIT;

public class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
    }
}

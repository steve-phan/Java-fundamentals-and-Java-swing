package com.company;

import MyThreads.Thread1;
import MyThreads.Thread2;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.fizzBuzzInJava8(12);

//        SwingUI swingUi = new SwingUI();
//        swingUi.createFrame();

//        GenericsClass genericsClass = new GenericsClass<>("Hello", 30);
//        System.out.println("This is X value: " + genericsClass.getX());
//        System.out.println("This is Y value: " + genericsClass.getY());

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

         thread1.setDaemon(true);
//         thread2.setDaemon(true);

        thread1.start();
//        try {
//            thread1.join(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        thread2.start();
//        thread1.setName("OMG Very first Thread");
//        System.out.println(1/0);
        System.out.println("Just fired");

    }
}

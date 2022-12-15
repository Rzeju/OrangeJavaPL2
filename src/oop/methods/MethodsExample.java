package oop.methods;


import java.util.Random;

public class MethodsExample {
    public static void main(String[] args) {
        printHelloWorld();
        int result = getNumber();
        System.out.println("Using variable to write on screen - " + result);
        getNumber();
        getNumber();
        System.out.println("Call method only - " + getNumber());

        int myRandom = getRandomNumber();
        System.out.println("My random number = " + myRandom);

        System.out.println("My random number without field = " + getRandomNumber());

        long addingResult = add(5, 10);
        System.out.println("Adding result = " + addingResult);

        System.out.println("Adding result without variable = " + add(-10, -20));

        printSomething("Something to print");
    }

    public static void printHelloWorld() {
        int x = 5 + 2;
        System.out.println("Hello World! - " + x);
    }

    public static int getNumber() {
        return 5;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100 + 1);
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static void printSomething(String somethingToPrint) {
        System.out.println(somethingToPrint);
    }
}

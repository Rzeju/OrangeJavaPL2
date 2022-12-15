package oop.methods;

public class MyMethods {

    public void printSomething(String somethingToPrint) {
        System.out.println(somethingToPrint);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int findTheGreatestNumberInArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result < numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MyMethods myMethods = new MyMethods();
        myMethods.printSomething("Method from my object");

        int result = myMethods.multiply(5, 10);
        System.out.println("Result from my object's method = " + result);

        int[] numbers = {50, 2, 10, -5, 47, -20, 21, 30, 120};

        int myMethodResult = myMethods.findTheGreatestNumberInArray(numbers);
        System.out.println("The biggest number in array is = " + myMethodResult);
    }

}

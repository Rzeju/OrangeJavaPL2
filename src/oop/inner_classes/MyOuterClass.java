package oop.inner_classes;

public class MyOuterClass {

    private final int myConstance = 5;

    public class MyInnerClass {
        public void printNumber() {
            System.out.println(myConstance);
        }
    }
    public MyInnerClass init() {
        return new MyInnerClass();
    }
}

package oop.inner_classes;

public class Main {

    public static void main(String[] args) {

        MyOuterClass myOuterClass = new MyOuterClass();

        MyOuterClass.MyInnerClass myInnerClass_1 = myOuterClass.init();
        MyOuterClass.MyInnerClass myInnerClass_2 = myOuterClass.new MyInnerClass();

        myInnerClass_1.printNumber();
        myInnerClass_2.printNumber();
    }
}

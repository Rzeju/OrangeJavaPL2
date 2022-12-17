package oop.inner_classes.inner_static_classes;

public class MyOuterClass {

    public static class MyStaticInnerClass {

    }

    public MyStaticInnerClass init() {
        return new MyStaticInnerClass();
    }

    public static MyStaticInnerClass staticInit() {
        return new MyStaticInnerClass();
    }

}

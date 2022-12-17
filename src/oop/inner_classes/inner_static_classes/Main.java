package oop.inner_classes.inner_static_classes;

public class Main {

    public static void main(String[] args) {

        MyOuterClass.MyStaticInnerClass myStaticInnerClass_1 = new MyOuterClass.MyStaticInnerClass();

        MyOuterClass myOuterClass = new MyOuterClass();
        MyOuterClass.MyStaticInnerClass myStaticInnerClass_2 = myOuterClass.init();

        MyOuterClass.MyStaticInnerClass myStaticInnerClass_3 = MyOuterClass.staticInit();

    }
}

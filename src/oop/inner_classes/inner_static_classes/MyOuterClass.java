package oop.inner_classes.inner_static_classes;

//Klasa zewnętrzna
public class MyOuterClass {

    //Statyczna klasa wewnętrzna
    public static class MyStaticInnerClass {

    }

    //metoda zwracająca obiekt statycznej klasy wewnętrznej
    public MyStaticInnerClass init() {
        return new MyStaticInnerClass();
    }

    //statyczna metoda zwracająca obiekt statycznej klasy wewnętrznej
    public static MyStaticInnerClass staticInit() {
        return new MyStaticInnerClass();
    }

}

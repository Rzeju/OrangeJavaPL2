package oop.inner_classes;

public class Main {

    public static void main(String[] args) {

        //Utworzenie klasy zewnętrznej
        MyOuterClass myOuterClass = new MyOuterClass();

        //Utworzenie klasy wewnętrznej metodą z klasy zewnętrznej
        MyOuterClass.MyInnerClass myInnerClass_1 = myOuterClass.init();
        //Utworzenie klasy wewnętrznej konstruktorem tej klasy przy użyciu obiektu klasy zewnętrznej
        MyOuterClass.MyInnerClass myInnerClass_2 = myOuterClass.new MyInnerClass();

        //Użycie metod obiektów klasy wewnętrznej
        myInnerClass_1.printNumber();
        myInnerClass_2.printNumber();
    }
}

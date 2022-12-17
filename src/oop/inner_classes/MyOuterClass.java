package oop.inner_classes;

//Klasa zewnętrzna
public class MyOuterClass {

    //stała w klasie zewnętrznej
    private final int myConstance = 5;

    //klasa wewnętrzna
    public class MyInnerClass {
        //metoda w klasie wewnętrznej
        //ma ona dostęp do pola klasy zewnętrznej
        public void printNumber() {
            System.out.println(myConstance);
        }
    }

    //metoda klasy zewnętrznej
    //tworzy obiekt klasy wewnętrznej i zwraca go
    public MyInnerClass init() {
        return new MyInnerClass();
    }
}

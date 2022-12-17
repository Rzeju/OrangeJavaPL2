package oop.inner_classes.inner_static_classes;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiekty statycznej klasy wewnętrznej
        //Nie potrzeba do tego utowrzenia obiektu klasy zewnętrznej
        MyOuterClass.MyStaticInnerClass myStaticInnerClass_1 = new MyOuterClass.MyStaticInnerClass();

        //Utowrzenie obiektu klasy zewnętrznej
        MyOuterClass myOuterClass = new MyOuterClass();
        //Utworzenie obiektu klasy wewnętrznej metodą obiektu klasy zewnętrznej
        //metoda init() nie jest statyczna dlatego wymaga obiektu klasy zewnętrznej
        MyOuterClass.MyStaticInnerClass myStaticInnerClass_2 = myOuterClass.init();

        //Utworzenie obiektu klasy wewnętrznej metodą statyczną klasy zewnętrznej
        //Metoda statyczna nie wymaga utworzenia obiektu klasy zewnętrznej
        MyOuterClass.MyStaticInnerClass myStaticInnerClass_3 = MyOuterClass.staticInit();

    }
}

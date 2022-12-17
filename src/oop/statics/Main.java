package oop.statics;

public class Main {

    public static void main(String[] args) {

        //Użycie metody statycznej z naszej klasy
        int result = StaticExample.add(5, 10);
        System.out.println(result);

        //Użycie stałych statycznych z klasy Math
        double myPi = Math.PI;
        double myE = Math.E;

        //Przypisanie nowej wartości do pola statycznego w naszej klasie
        StaticExample.myStaticField = 20;
        System.out.println(StaticExample.myStaticField);

    }
}

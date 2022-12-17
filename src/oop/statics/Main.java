package oop.statics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Użycie metody statycznej i dostęp do pól statycznych");
        //Użycie metody statycznej z naszej klasy
        int result = StaticExample.add(5, 10);
        System.out.println("Wynik metody statycznej = " + result);

        //Użycie stałych statycznych z klasy Math
        double myPi = Math.PI;
        double myE = Math.E;

        //Przypisanie nowej wartości do pola statycznego w naszej klasie
        StaticExample.myStaticField = 20;
        System.out.println("Wartość pola statycznego = " + StaticExample.myStaticField);


        //UDOWODNIENIE, ŻE POLE STATYCZNE JEST KLASOWE
        //(WSPÓLNE DLA WSZYSTKICH OBIEKTÓW KLASY)

        System.out.println("POLA STATYCZNE JAKO POLE KLASOWE");
        //Utworzenie obiektów naszej klasy
        StaticExample staticExample_1 = new StaticExample();
        StaticExample staticExample_2 = new StaticExample();

        //Dostęp do pola statycznego naszej klasy (nie jest to polecana praktyka)
        System.out.println("Pole statyczne poprzez staticExample_1 = " + staticExample_1.myStaticField);
        System.out.println("Pole statyczne poprzez staticExample_2 = " + staticExample_2.myStaticField);

        //Zmiana wartości pola statycznego poprzez obiekt (nie jest to polecana praktyka)
        staticExample_1.myStaticField = 100;

        //Ponowne wyświetlenie wartości pola statycznego przez obiekty oraz klasę
        //Pomimo zmiany wartości pola jedynie pooprzez jeden z obiektów (staticExample_1.myStaticField = 100;)
        //Wartość pola ulega zmianie dla całej klasy/wszystkich obiektów
        //POLE STATYCZNE JEST POLEM KLASOWYCH (jest jedno dla wszystkich obiektów tej klasy)
        System.out.println("Pole statyczne po zmianie poprzez staticExample_1 = " + staticExample_1.myStaticField);
        System.out.println("Pole statyczne po zmianie poprzez staticExample_2 = " + staticExample_2.myStaticField);
        System.out.println("Pole statyczne poprzez klasę StaticExample = " + StaticExample.myStaticField);

    }
}

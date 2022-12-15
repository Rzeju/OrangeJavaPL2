package arrays;

public class OneDimensionArraysExample {


    public static void main(String[] args) {

        //deklaracja i inicjalizacja tablicy
        //w zapisie tym nie występuje inicjalizacja poszczególnych elementów tablicy
        //oznacza to, że wszytskie elementy tej tablicy mają wartość domyślną (default)
        int[] intArray = new int[5];

        System.out.println("Wyświetlanie i inicjalizacja wybranych elementów tablicy");
        //wyświetlenie pierwszego elementu tablicy (index 0)
        //wartość domyślna dla zmiennych liczbowych to 0
        //(wszytskie elementy tej tablicy mają obecnie wartość 0)
        System.out.println("Element 1 -> " + intArray[0]);

        //przypisanie do drugiego elementu tablicy (index 1) wartości 5
        intArray[1] = 5;
        //wyświetlenie wartości drugie elementu tablicy (będzie to 5)
        System.out.println("Element 2 -> " + intArray[1]);

        //przypisanie wartości do trzeciego i czwartego elementu tablicy (index 2 oraz index 3)
        intArray[2] = 17;
        intArray[3] = -20;

        System.out.println("Wyświetlenie wszytskich elementów tablicy przy użyciu pęlti for");
        //pętla for wyświetlająca po kolei elementy tablicy (poprzez użycie idexu jej elemetów od 0 do 4)
        for (int i = 0; i < 5; i++) {
            int myElement = intArray[i];
            System.out.printf("Element tablicy o indeksie = %d, wynosi -> %d \n", i, myElement);
        }

        System.out.println("Utworzenie tablicy wraz z jej elementami i wyświetlenie ich pętlą for");
        //deklaracje i inicjalizacje tablicy wraz z inicjalizacją poszczególnych elemwntów
        int[] intArray_2 = new int[]{1, 5, 15, -20, 11};

        //pętla for wyświetlająca wszytskie elementy tablicy intArray_2
        //w pęlti for korzystamy ze zmiennej length, która określa rozmiar tablicy
        for (int i = 0; i < intArray_2.length; i++) {
            System.out.printf("Zainicjalizowane elementy tablicy 'intArray_2 to: index = %d, wartość = %d \n", i, intArray_2[i]);
        }

        System.out.println("Utworzenie tablicy Stringów i wyświetlenie jej wszystkich elementów");
        //Deklaracja i inicjalizacja tablicy Stringów o długości 7 (7 elementów)
        String[] myStringArray = new String[7];

        //pętla wyświetlająca wszyskie elementy tablicy
        //obecnie elementy nie zostały jeszcze zainicjalizowane, mają wartości domyśle (dla Stringów jest to 'null')
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        System.out.println("Inicjalizacja elementów tablicy i wyświetlenie ich");
        //zmienna pomocnicza
        String a = "a";
        //pętla umieszcza w kolejnych elementach tablicy wielokrotność litery 'a'
        //każdy element będzie miał o jedno 'a' więcej niż poprzedni
        for (int i = 0; i < myStringArray.length; i++) {
            myStringArray[i] = a;
            a = a + "a";
        }

        //wyświetlenie wszytskihc elementów tablicy
        //jej elementy mają już wartości ustawione w pętli powyżej
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        //PRZEKROCZENIE ZAKRESU TABLICY!!!

        System.out.println("Przykład wystąpienie wyjątku/błędu -> ArrayIndexOutOfBoundsException");
        String[] arrayForShowingException = new String[5];

        arrayForShowingException[1] = "Element 1";
        arrayForShowingException[4] = "Element 2";

        for (int i = 0; i < 7; i++) {
            System.out.printf("Index = %d, Element = %s\n", i, arrayForShowingException[i]);
        }

    }
}


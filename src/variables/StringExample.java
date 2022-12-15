package variables;

public class StringExample {

    public static void main(String[] args) {

        //deklaracja i inicjalizacja zmiennych
        String myString = "Some String";
        String mySecondString = "New String";

        //wyświetlenie zmiennej
        System.out.println(myString);
        //przykłady metod w klasie String
        System.out.println("myString ma długość = " + myString.length());
        System.out.println(myString.equals(mySecondString));
        System.out.println(mySecondString.toUpperCase());

        //deklaracja zmiennej
        String result;

        //inicjalizacja zmiennej
        result = myString + " " + mySecondString;

        System.out.println("Result = " + result);

        //przykłady zamiany innych typów danych an String
        int someNumber = 17;

        //zamiana zmiennej typu int na Stringa metodą 'valueOf()'
        String stringNumber = String.valueOf(someNumber);

        //zmiana aktualnej wartości zmiennej i przypisanie do niej jej nowej wartości
        result = result + " " + stringNumber;

        //wypisanie na ekran zmiennej result
        System.out.println(result);
    }
}

package variables;

public class CharactersExample {

    public static void main(String[] args) {

        //deklaracja i inicjalizacja zmiennej
        char myChar = 'p';

        //wyświetlenie zmiennej
        System.out.println(myChar);

        //deklaracja i inicjalizacja nowej zmiennej
        char newChar = 'k';

        //deklaracja zmiennej
        int result;

        //przykład niejawnego rzutowania
        //nasze chary został zamienione na liczby
        result = myChar + newChar;

        //wyświetlenie wyniku
        System.out.println(result);


    }
}

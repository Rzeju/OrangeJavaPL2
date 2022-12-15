package variables;

public class BooleanExample {

    public static void main(String[] args) {

        //deklaracja i inicjalizacja zmiennych
        boolean someTrue = true;
        boolean someFalse = false;

        //wyświetlenie wartości zmiennych
        System.out.println("My true = " + someTrue);
        System.out.println("My false = " + someFalse);

        //deklaracja zmiennej
        boolean orResult;
        boolean andResult;

        //przypisanie do zmiennych wyniku operacji logicznych
        orResult = someTrue || someFalse;
        andResult = someTrue && someFalse;

        //wyświetlenie wartości zmiennych z wynikami operacji logicznych
        System.out.println("Wynik or = " + orResult);
        System.out.println("Wynik and = " + andResult);


    }
}

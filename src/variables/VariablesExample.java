
package variables;
public class VariablesExample {

    //deklaracja zmiennej (zmienna globalna)
    private int number;

    //deklaracja i inicjalizacja zmiennej (zmienna globalna)
    private final int nextNumber = 5;

    //metoda w klasie
    public void someMethod() {
        //przypisanie wartości do zmiennej 'number'
        number = 10;

        //deklaracja zmiennej (zmienna lokalna dla metody 'someMethod')
        int result;

        //przypisanie do zmiennej result wyniku dodawania
        result = number + nextNumber;

        //wypisanie na ekran wyniku dodawania
        System.out.println("Wynik wynosi = " + result);
    }

    //metoda zwracająca wartość liczbową
    public int add(int x, int y) {

        //zmienna loklana zawierająca wynik
        int result = x + y + nextNumber;

        //metoda zwraca wynik działania
        return result;
    }

    //Metoda main
    public static void main(String[] args) {

        //utworzenie obiektu typu VariablesExample
        VariablesExample myObject = new VariablesExample();
        //wywołanie metody 'someMethod' na obiekcie 'myObject'
        myObject.someMethod();

        int methodResult = myObject.add(10, 100);

    }
}

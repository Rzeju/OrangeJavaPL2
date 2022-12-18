package varargs;

public class VarargsExample {

    //metoda statyczna ze zmienną liczbą argumentów
    //argumenty przekazane to tej metody znajdą się później w tablicy nazwanej tutaj 'numbers'
    //do wywołania tej metody nie trzeba tworzyć obiektu klasy VarargsExample (metoda jest statyczna)
    public static void varArgs(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Metoda varArgs - element = " + numbers[i]);
        }
    }

    //metoda statyczna z jednym stałym argumenetm oraz z argumentem przyjmującym zmienną liczbię parametrów
    //stały argument 'firstArgument' nie będzie częścią tablicy 'numbers' zawierającej resztę wprowadzonych argumentów
    //metodę tę można wywołać podając jeden lub więcej argumentów (przynajmniej jeden argument)
    public static void backwardsLoop(int firstArgument, int... numbers) {
        System.out.println("Stały argument = " + firstArgument);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Backwards loop - element = " + numbers[i]);
        }

    }
}

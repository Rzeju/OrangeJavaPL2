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
}

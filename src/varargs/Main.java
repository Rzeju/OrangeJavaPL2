package varargs;

public class Main {

    public static void main(String[] args) {

        //Wywołanie metody, z różną liczbą argumentów
        VarargsExample.varArgs(5, -10, 50);
        //Zauważ, że metodę ze zmienną liczbą argumentów można wywołać bez podania żadnego z nich
        VarargsExample.varArgs();

        VarargsExample.varArgs(1);

        VarargsExample.varArgs(1000, 20, -10, 17, 150);


    }
}

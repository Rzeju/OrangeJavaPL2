package operators;

public class IncrementationExample {

    public static void main(String[] args) {

        //Zarówna i++ oraz ++i jest równoważne zapisowi -> i = i + 1;


        //deklaracja i inicjalizacja zmiennej do inkrementacji
        int i = 0;

        System.out.println(i++); // out = 0, i = 1

        System.out.println(++i); // out = 2, i = 2

        i++; // i = 3

        i++; // i = 4

        System.out.println(i); // out = 4,

        ++i; // i = 5

        System.out.println(i); // out = 5

        System.out.println(i++); // out = 5, i = 6

        System.out.println(++i); // out = 7, i = 7
    }
}

package operators;

public class DecrementationExample {


    public static void main(String[] args) {

        int i = 10;

        --i; // i = 9

        System.out.println(i--); // out = 9, i = 8

        System.out.println(i--); // out = 8, i = 7

        System.out.println(--i); // out = 6, i = 6

        i--; // i = 5

        i--; // i = 4

        --i; // i = 3

        System.out.println(i); // out = 3, i = 3

        System.out.println(i--); // out = 3, i = 2

        System.out.println(--i); // out = 1, i = 1
    }
}

package standard_in_out;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbę całkowitą");
        int myInt = scanner.nextInt();
        System.out.println("Podaj liczbę z ułamkiem dziesiętnym");
        double myDouble = scanner.nextDouble();
        System.out.printf("%d / %.2f = %6.4f%n", myInt, myDouble, myInt / myDouble);

        System.out.println("Podaje wartość logiczną");
        boolean myBoolean = scanner.nextBoolean();
        System.out.printf("Moja wartość logiczna to -> %b%n", myBoolean);

        System.out.println("Wprowadź tekst");
        String myLine = scanner.nextLine();
        System.out.printf("Moja linia to -> %s", myLine);
    }
}

package variables;

public class NumbersExample {

    public static void main(String[] args) {

        //typy danych dla liczb całkowitych
        byte myByte = -100;
        short myShort = 1200;
        int myInt = 17;
        long myLong = 1234567890123456789L;

        //typy danych dla liczb zmiennoprzecinkowych
        float myFloat = 12.12345876556758f;
        double myDouble = 3.142131273471297123987d;

        //wyświetlanie liczby bez formatowania
        System.out.println("My float = " + myFloat);
        //wyświetlanie libcz z formatowaniem -> %.9f
        System.out.printf("printf - My float = %.9f, myByte = %d, myShort = %d \n", myFloat, myByte, myShort);

        //wyświetlanie liczby bez formatowania
        System.out.println("My double = " + myDouble);
        System.out.printf("My formatted double = %.20f", myDouble);




    }
}

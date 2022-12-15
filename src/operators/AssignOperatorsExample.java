package operators;

public class AssignOperatorsExample {

    public static void main(String[] args) {

        System.out.println("Dodawanie: ");
        //deklaracja i inicjalizacja zmiennej
        int a = 50;
        //zmiana wartości zmiennej a i przypisanie nowej wartości do zmiennej a
        a += 20;
        System.out.println("a = " + a);

        //deklaracja i inicjalizacja zmiennej
        int b = 50;
        //jest to taka sama operacja jak dla zmiennej a w lini 10
        b = b + 20;
        System.out.println("b = " + b);

        System.out.println("Mnożenie: ");
        //deklaracja i inicjalizacja zmiennej
        int x = 100;
        //zmiana wartości zmiennej x i przypisanie nowej wartości do zmiennej x
        x *= 2;
        System.out.println("x = " + x);

        //deklaracja i inicjalizacja zmiennej
        int y = 100;
        //zmiana wartości zmiennej y i przypisanie nowej wartości do zmiennej y
        y = y * 2;
        System.out.println("y = " + y);
    }
}

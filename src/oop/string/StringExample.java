package oop.string;

public class StringExample {

    public static void main(String[] args) {

        //Preferowana forma tworzenia Stringów
        String myString = "This is my String!";

        //Ta forma tworzenia Stringów nie jest polecana (tutaj jako przykład i pokazanie takiej możliwości)
        String myStringObject = new String("This is my String Object!");

        //Sposób na łączenie Stringów (konkatenacja)
        //Przy dużej kliczbie Stringów nie jest to zalecany sposób (wtedy StringBuilder)
        String finalText_1 = myString + "\n" + myStringObject;
        System.out.println("finalText_1");
        System.out.println(finalText_1);

        //Przykład konkatenacji Stringów metodą concat (wynik jest taki sam jak w sposobie powyżej)
        String finalText_2 = myString.concat("\n").concat(myStringObject);
        System.out.println("finalText_2");
        System.out.println(finalText_2);

        System.out.println("Porównanie finalText_1 i finalText_2 = " + finalText_1.equals(finalText_2));
        System.out.println("Porównanie myString i myStringObject = " + myString.equals(myStringObject));

        myString.intern();

        System.out.println("Długość myString = " + myString.length());
        System.out.println("myString upperCase() = " + myString.toUpperCase());
        System.out.println("myString isBlank() = " + myString.isBlank());
        System.out.println("myString is Empty() = " + myString.isEmpty());
        System.out.println("Metoda isEmpty()");
        System.out.println("".isEmpty());
        System.out.println("     ".isEmpty());
        System.out.println("Metoda isBlank()");
        System.out.println("".isBlank());
        System.out.println("     ".isBlank());
    }
}

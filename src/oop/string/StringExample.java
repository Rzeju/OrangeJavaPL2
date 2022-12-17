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

        //Przykład metody equals()
        System.out.println("Porównanie finalText_1 i finalText_2 = " + finalText_1.equals(finalText_2));
        System.out.println("Porównanie myString i myStringObject = " + myString.equals(myStringObject));

        //Przykłąd metody intern() -> (warto pamiętać o String pool'u i przypomnieć sobie wiadomości o nim)
        myString.intern();

        //Przykłady metod z klasy String
        System.out.println("myString" + myString);
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


        //Więcej metod z klasy String
        System.out.println("myStringObject = " + myStringObject);
        System.out.println("myStringObject indexOf('my') = " + myStringObject.indexOf("my"));
        System.out.println(myStringObject.substring(8));

        //Przykład metody split oraz wyświetlenie elemnetów tablicy, którą utworzyła
        String[] splittedString = myStringObject.split(" ");
        for (int i = 0; i < splittedString.length; i++) {
            System.out.println("Index = " + i + ", element = " + splittedString[i]);
        }

        //Przykład metody split otaz pętli foreach na tablicy, którą utowrzyła metoda
        String[] myLetters = myStringObject.split("");
        for(String elem : myLetters) {
            System.out.println(elem);
        }
    }
}

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

        String finalText_2 = myString.concat("\n").concat(myStringObject);
        System.out.println("finalText_2");
        System.out.println(finalText_2);
    }
}

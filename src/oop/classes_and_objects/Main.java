package oop.classes_and_objects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu typu Person
        //W konstruktorze nie przekazujemy parametrów
        //Pola w naszym obiekcie zainicjalizują się wartościami domyślnymi
        Person person_1 = new Person();

        //Ustawiamy wartości dla poszczególnych pól przy użyciu setterów
        person_1.setFirstName("Piotr");
        person_1.setLastName("Andrzejak");
        person_1.setAge(29);
        person_1.setAge(30);

        System.out.println("Wyświetlenie wartości pól dla obiektu person_1");
        //Wypisujemy wartości pól przy użyciu getterów
        System.out.println(person_1.getFirstName());
        System.out.println(person_1.getLastName());
        System.out.println(person_1.getAge());

        //Nowy obiekt person_2
        //Użycie konstruktora bezargumentowego
        Person person_2 = new Person();

        System.out.println("Wyświetlenie wartości pól dla obiektu person_2");
        //Wypisujemy wartości pól przy użyciu getterów
        //Zwóć uwagę, że te wartości mają wartość domyśłną (default)
        //Wartości tych pól nie został ustawione przez settery ani w konstruktorze
        System.out.println(person_2.getFirstName());
        System.out.println(person_2.getLastName());
        System.out.println(person_2.getAge());


        //Użycie konstruktora z argumentami
        Person person_3 = new Person("Tadeusz", "Nazwisko", 50);

        System.out.println("Wyświetlenie wartości pól dla obiektu person_3");
        System.out.println(person_3.getFirstName());
        System.out.println(person_3.getLastName());
        System.out.println(person_3.getAge());


        //Utworzenie obiektu typu Person wprowadzając dane z klawiatury

        //Utworzenie scannera
        Scanner scanner = new Scanner(System.in);

        //scanner przyjmuje kolejne wartości/dane
        System.out.print("Podaj imię: ");
        //program oczekuje na wpisanie ciągu znaków
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        //program oczekuje na wpisanie ciągu znaków
        String lastName = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        //program oczekuje na wpisanie liczby
        int age = scanner.nextInt();

        Person scannerPerson = new Person(firstName, lastName, age);

        System.out.println(scannerPerson.getFirstName());
        System.out.println(scannerPerson.getLastName());
        System.out.println(scannerPerson.getAge());











        person_1.someStaticMethod();
        Person.someStaticMethod();
    }
}

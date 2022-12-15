package oop.classes_and_objects;

//klasa reprezentująca osobę
public class Person {

    // pole/zmienna przetrzymująca imię
    private String firstName;

    // pole/zmienna przetrzymująca nazwisko
    private String lastName;

    // pole/zmienna przetrzymująca wiek
    private int age;

    public Person() {

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //PRZYKŁADY PRZECIĄŻENIA KONSTRUKTORA
    //istotna jest kolejność typów argumnetów (nie może wystąpić traki sam zestawu)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int age, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //setter dla pola firstName
    //ustawia wartość pola firstName w obiekcie Person
    //JEST TO METODA
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //setter dla pola lastName
    //ustawia wartość pola lastName w obiekcie Person
    //JEST TO METODA
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //setter dla pola age
    //ustawia wartość pola age w obiekcie Person
    //JEST TO METODA
    public void setAge(int age) {
        this.age = age;
    }

    //getter dla pola firstName
    //zwraca wartośc pola firstName
    //JEST TO METODA
    public String getFirstName() {
        return firstName;
    }

    //getter dla pola lastName
    //zwraca wartośc pola lastName
    //JEST TO METODA
    public String getLastName() {
        return lastName;
    }

    //getter dla pola age
    //zwraca wartośc pola age
    //JEST TO METODA
    public int getAge() {
        return age;
    }

    public static void someStaticMethod() {
        System.out.println("Invoking static method");
    }

}

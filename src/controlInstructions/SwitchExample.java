package controlInstructions;

public class SwitchExample {

    public static void main(String[] args) {

        String myString = "Hello";

        switch(myString) {

            case "Hello":
                System.out.println("Cześć!");
                break;
            case "Goodbye":
                System.out.println("Dowidzenia");
                break;
            default:
                System.out.println("Blok default");
                break;
        }

        System.out.println("Dalszy ciąg programu");
    }
}

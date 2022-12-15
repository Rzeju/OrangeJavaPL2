package controlInstructions;

public class IfExample {

    public static void main(String[] args) {

        float temperature = 36.6f;
        if (temperature >= 37.0f) {
            System.out.println("Masz gorączkę/stan podgorączkowy");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.println("Jesteś zdrowy/zdrowa");
        } else {
            System.out.println("Jesteś osłabiony/osłabiona");
        }

        System.out.println("Dalszy kod programu!");
    }
}

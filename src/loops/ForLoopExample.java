package loops;

public class ForLoopExample {

    public static void main(String[] args) {

        int result = 0;
        for(int i = 0; i < 10; i++) {
            result = result + i;
        }
        System.out.println("Suma cyfr wynosi = " + result);


        result = 0;
        for(int i = 0; i <= 100; i = i + 2) {
            result = result + i;
        }
        System.out.println("Suma liczb parzystych do 100 = " + result);


        result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                result = result + i;
            }
        }
        System.out.println("Suma liczb nieparzystych do 100 = " + result);


        result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 1 || i % 3 == 2) { //tożsamy warunek z zaprzeczeniem i % 3 != 0
                result = result + i;
            }
        }
        System.out.println("Suma liczb niepodzilenych przez 3 do 100 = " + result);

    }
}

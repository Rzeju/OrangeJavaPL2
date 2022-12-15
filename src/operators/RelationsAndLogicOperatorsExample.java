package operators;

public class RelationsAndLogicOperatorsExample {

    public static void main(String[] args) {

        int x = 10;
        int y = -15;

        boolean result;

        result = x > y;
        System.out.println("x > y ---> " + result);

        result = x < y;
        System.out.println("x < y ---> " + result);

        result = true && !(x > y || x < y);

        System.out.println("Długie wyrażenie ma wartość logiczną --> " + result);

        result = x <= 10;
        System.out.println(result);



    }
}

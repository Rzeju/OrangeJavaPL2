package casting;

public class CastingExample {

    public static void main(String[] args) {

        //deklaracja i inicjalizacja zmienny do rzutowania
        byte myByte = 100;
        short myShort = 217;
        int myInt = 11112;
        long myLong = 5454355843535465645L;

        //niejawne rzutowanie na longa - przykłady
        long myLongCastingBox;

        myLongCastingBox = myInt;
        System.out.println("myInt = " + myInt);
        System.out.println("myInt in long box = " + myLongCastingBox);

        myLongCastingBox = myShort;
        System.out.println("myShort = " + myShort);
        System.out.println("myShort in long box = " + myLongCastingBox);

        myLongCastingBox = myByte;
        System.out.println("myByte =" + myByte);
        System.out.println("myByte in long box = " + myLongCastingBox);

        //jawne rzutowanie na int
        int myIntCastingBox;

        myIntCastingBox = (int) myLong;
        System.out.println("myLong = " + myLong);
        System.out.println("myLong in int box = " + myIntCastingBox);

        //rzutowanie liczb zmiennoprzecinkowych
        float myFloat = 17.23123f;
        double myDouble = 12321.45435455345d;

        double myDoubleCastingBox;
        float myFloatCastingBox;

        myDoubleCastingBox = myLong;
        myFloatCastingBox = myLong;
        System.out.println("myLong = " + myLong);
        System.out.println("myLong in double box = " + myDoubleCastingBox);
        System.out.println("myLong in float box = " + myFloatCastingBox);


        myFloatCastingBox = (float) myDouble;
        System.out.println("my double = " + myDouble);
        System.out.println("my double in float box = " + myFloatCastingBox);
    }
}

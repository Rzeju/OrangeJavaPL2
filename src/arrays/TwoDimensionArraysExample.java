package arrays;

import java.util.Random;

public class TwoDimensionArraysExample {

    public static void main(String[] args) {

        String[][] myArray2D_1 = new String [2][];
        // [null, null]



        String[][] myArray2D_2 = new String [2][4];
        // [ [null, null, null, null], [null, null, null, null] ]
        //Wersja macierzowa
        // null, null, null, null
        // null, null, null, null

        //Z powodu nie podania liczby kolumn (drugiego rozmiaru) nie jest wiadome jakiego rozmiaru tablicę utworzyć
        //W związku z tym otrzymujemy tablicę z samymi nulla (tablica jednowymiarowa)
        System.out.println("Wyświetlenie elementów tablicy myArray2D_1");
        System.out.println(myArray2D_1[0]);
        System.out.println(myArray2D_1[1]);

        //W przypadku drugiej tablicy 'myArray2D_2' liczba kolumn jest znana (drugi rozmiar)
        //W tym przypadku istnieje możliwość utworzenia tablic zawiercających kolumny (tablice w tablicy)
        //Bezpośrednie wyświetlenie którejś z tych tablic 'myArray2D_2[0]' wyświetli na referenjcę do niej (adres w pamięci)
        System.out.println("Wyświetlanie elementów tablicy myArray2D_2");
        System.out.println(myArray2D_2[0]);
        System.out.println(myArray2D_2[1]);

        //To drugiego wiersza (drugiego elementu tablicy) przyporządkowujemy nową tablice (nowy wiersz)
        //Zwróć uwagę, że rozmiar nowej tablicy jest różny od 4 (definicja naszej tablicy nie pilnuje poprawności rozmiaru)
        //Wynika to z tego, że nasza tablic przechowuje wewnątrz jedynie referencję do innych tablic
        //Każdy z wierszy ma w sobie referencję do innej tablicy, która zawiera w sobie wszytskie elementy dla tego wiersza (kolumny)
        //ZWRÓC UWAGĘ, ŻE KAŻDA Z TYCH REFERNCJI JEST INNA!!!!! (wiersze 28, 29, 37)
        myArray2D_2[1] = new String[5];
        System.out.println(myArray2D_2[1]);


        //UŻYCIE TABLIC 2-WYMIAROWYCH
        System.out.println("Użycie tablicy dwuwymiarowej");
        myArray2D_2[1] = new String[4];

        myArray2D_2[0][0] = "Some String";
        myArray2D_2[0][2] = "sasdasffs";
        myArray2D_2[0][3] = "Bla bla bla";
        myArray2D_2[1][1] = "Raz dwa trzy";
        myArray2D_2[1][2] = "12123 1234";
        myArray2D_2[1][3] = "Hey ho!!";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Index = [%d, %d] -> %s\n", i, j, myArray2D_2[i][j]);
            }
        }

        //1. Utwórz tablicę dwuwymiarową 5x2 typu całkowitoliczbowego. Uzupełnij jej elementy losowymi liczbami nie większymi
        //niż 20. Każda para tych liczb reprezentuj epunkt na płaszczyźnie (x, y). Wyświetl wszystkie elementy tej tablicy
        //np. w taki sposób --->
        // 1. (10, 15)
        // 2. (11, 17)
        // 3. (1, 2)
        // ..........

        //2. Posortuj uzyskane punkty względem jeden ze współrzędnych malejąco lub rosnąco
        //Utwórz nową tablicę i zapisz w niej elementy w posortowanej kolejności
        //Wyświetl wszystkie posortowane elementy

        Random random = new Random();
        int number = random.nextInt(20 + 1);






    }
}

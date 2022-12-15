package arrays;

import java.util.Random;

public class Exercise {

    public static void main(String[] args) {

        int[][] myArray = new int[5][2];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                myArray[i][j] = random.nextInt(20 + 1);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. (%d, %d)\n", i + 1, myArray[i][0], myArray[i][1]);
        }
    }
}

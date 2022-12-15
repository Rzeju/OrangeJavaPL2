package loops;

public class WhileLoopExample {

    public static void main(String[] args) {

        int i = 0;

        //pętla skończona
        while(i < 10) {
            char firstLetter = 'a';
            int nextChar = firstLetter + i;
            System.out.println((char) nextChar);
            i++;
        }


        //pętla nieskończona
        int j = 0;
        while (true) {
            System.out.println("INFINITY!");
            if (j == 100) {
                break;
            }
            j++;
        }
    }
}

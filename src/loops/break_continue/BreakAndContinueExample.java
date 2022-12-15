package loops.break_continue;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        //pętla z przykładem użycia instrukcji break
        //instrukcja break kończy działanie pętli
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("Wartość i w pętli for i = " + i);
        }

        //zmienna n jest iteratorem dla pętli while
        int n = 0;
        //nieskończona pętla while z warunkiem, który będzie ją kończył
        //instrukcja break kończy działa pętli
        while(true) {
            //zakomentuj warunek if aby zobaczyć jak działa nieskończona pętla while
            if(n == 4) {
                break;
            }
            System.out.println("Wartość n i pętli while n = " + n);
            n++;
        }


        //CONTINUE
        //continue powoduje przejście do kolejnego kroku pętli (do kolejnej iteracji)
        //w momencie wykonania instrukcji continue aktualny krok pętli jest pomijany
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Tylko parzyste i --> i = " + i);
        }

        //przykłąd użycia instrukcji continue w pęlti while
        //nie jest to dobra praktyka ze zwględu na możliwość uzyskania pętli nieskończonej
        //inkrementacja interatora n na początku pętli (linia 45) nie jest oczekiwanym zachowaniem
        //inkrementacja iteratora powinna następować na samym końcu każdego kroku pętli
        n = 0;
        while (n < 8) {
            n++;
            if (n % 2 == 0) {
                continue;
            }
            System.out.println("Tylko nieparzyste n --> n = " + n);

        }
    }
}

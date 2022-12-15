package loops;

public class DoWhileExample {

    public static void main(String[] args) {

        //zmienna jako licznik pętli
        int i = 0;

        //pętla do while, która będzie się wykonywać do czasu aż warunek będzie spełniony
        do {
            System.out.println("Ta pętla wykonuje się poraz -> " + (i + 1));
            i++;
        } while (i < 5);

        //zmiana wartości licznika pętli takl aby warunek nie był spełniony
        i = 6;

        //pomimo tego, że warunek pętli nie jest spełniony już na smaym początku
        //kod zawarty w 'do' wykona się przynajmniej raz
        //(KOD W DO ZAWSZE WYKONA SIĘ PRZYNAJMNIEJ RAZ!!!!)
        do {
            System.out.println("To polecenie wykona się nawet przy niespełniony warunku w 'while'");
            i++;
        } while (i < 5);


    }
}

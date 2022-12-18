package regular_expresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        //Tworzymy obiekt pattern na podstawie przekazanego wyrażenia regularnego (regex)
        Pattern pattern = Pattern.compile("a+bcd");

        //Tworzymy obiekt matcher na podstawie tekstu, który będziemy chcieli porównać z naszym regexem
        Matcher matcher = pattern.matcher("aaaaabcd aaaaaaabbcd");

        //Metoda matches() sprawdza czy nasz tekst w całości pasuje do regexu
        System.out.println("Matches result = " + matcher.matches());
        //Metoda find() sprawdza czy w naszym tekście znajduje się ciąg znaków pasujący do regexu
        System.out.println("Find result = " + matcher.find());
    }
}

package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char symbol;
        for (int i = 97; i <= 122; i++) {
            symbol = (char) i;
            System.out.println(symbol);
        }
    }
}

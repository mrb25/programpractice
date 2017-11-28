import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        char[][] minefield = new char[9][9];
        boolean isplaced = false;
        //Generate the minefield with lines around the field.
        for (int i = 0; i < 9; i++) {
            Random rand = new Random;
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    minefield[i][j] = '+';
                }
                else {
                    minefield[i][j] = 'f';
                }
            }
        }
        System.out.println(printField(minefield));
    }

    private static String printField(char[][] minefield) {
        String printedField = "";
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                printedField += minefield[i][j];
                printedField += ' ';
            }
            printedField += '\n';
        }
        return printedField;
    }
}

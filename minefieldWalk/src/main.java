import java.util.Random;

public class main {
    public static void main(String[] args) {

        char[][] minefield = new char[9][9];
        Random rand = new Random();

        //Generate the minefield with lines around the field.
        for (int i = 0; i < 9; i++) {
            int placemine = rand.nextInt(7) + 1;
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    minefield[i][j] = '+';
                }
                else if (j == placemine) {
                    minefield[i][j] = 'X';
                }
                else {
                    minefield[i][j] = 'O';
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

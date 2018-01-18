import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        char[][] minefield = new char[9][9];
        boolean isFinished = false;
        Random rand = new Random();
        int botLocation[];

        //Generate the minefield with lines around the field.
        for (int i = 0; i < 9; i++) {
            int placeMine = rand.nextInt(7) + 1;
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    minefield[i][j] = '+';
                }
                else if (j == placeMine) {
                    minefield[i][j] = 'X';
                }
                else {
                    minefield[i][j] = 'O';
                }
            }
        }
        bot robot = new bot();
        Scanner scanner = new Scanner(System.in);
        while (!isFinished) {
            botLocation = robot.getLocation();
            if (botLocation[1] >= 9) {
                isFinished = true;
                break;  //finishes game when it crosses the bottom X line
            }
            minefield[botLocation[0]][botLocation[1]] = 'R';
            System.out.println(printField(minefield));
            System.out.println("Input: ");
            String input = scanner.next();
            char command = input.charAt(0);
            robot.moveBot(command);
        }
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

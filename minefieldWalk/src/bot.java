public class bot {
    private boolean ison = false;
    private int x_location = 0;
    private int y_location = 0;

    public bot() {
        //default values are fine
    }

    void togglePower() {
        if (ison) ison = false;
        else ison = true;
    }

    void moveBot(char input) {
        if (input == 'n') y_location += 1;
        else if (input == 's') y_location -= 1;
        else if (input == 'e') x_location += 1;
        else if (input == 'o') x_location -= 1;
        else System.out.println("That is not a valid input");
    }

    private int[] getLocation() {
        int[] toreturn = {x_location, y_location};
        return toreturn;
    }
}

public class bot {
    private boolean ison;
    private int x_location;
    private int y_location;

    public bot() {
        ison = false;
        x_location = 0;
        y_location = 0;
    }

    void togglePower() {
        if (ison) ison = false;
        else ison = true;
    }

    void moveBot(char input) {
        if (input == 't') {
            togglePower();
            return;
        }
        if (!ison) return;
        if (input == 'n') y_location -= 1;
        else if (input == 's') y_location += 1;
        else if (input == 'e') x_location += 1;
        else if (input == 'o') x_location -= 1;
        else System.out.println("That is not a valid input");
    }

    public int[] getLocation() {
        int[] toreturn = {y_location, x_location};
        return toreturn;
    }
}

import java.util.Scanner;

public class addcalc {


        public static void main(String[] args){
            // retrieve the necessary inputs
            int firstnum, secondnum, result = 0;
            String var;
            Scanner reader = new Scanner(System.in);
            System.out.println("First int:");
            firstnum = reader.nextInt();
            System.out.println("Operator: (+,-,*,/) ");
            var = reader.next();
            while (!"+".equals(var) && !"-".equals(var) && !"*".equals(var) && !"/".equals(var)) {
                System.out.println("Not a correct variable, try again: ");
                var = reader.next();
            }
            System.out.println("Second Int: ");
            secondnum = reader.nextInt();

            System.out.println("Calculating " + firstnum + " " + var + " " + secondnum + ":");
            if ("+".equals(var)) {
                result = addcalc.add(firstnum, secondnum);
            }
            System.out.println(Integer.toString(result));

        }

        public static int add(int first, int second) {
            int result = first + second;
            return result;
        }
    }

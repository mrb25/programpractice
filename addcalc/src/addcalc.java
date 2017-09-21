/*
Make a calculator that lets the user add, subtract, multiply and divide integers. It should allow exponents too.
The user can only enter integers and must expect the result to be integers. The twist is that YOU, the programmer, can
only let the program calculate expressions using addition. Only addition. The user can enter 3*2 however you cannot
calculate it using multiplication.

Basically, the programmer is not allowed to multiply, divide and subtract using the operations provided by a
programming language. To the programmer, the only accessible direct operation is addition.

Your calculator should be able to handle addition, subtraction, division, multiplication and exponents. No modulo
operation (to obtain the remainder for two given operands) too.

https://www.reddit.com/r/dailyprogrammer/comments/6ze9z0/20170911_challenge_331_easy_the_adding_calculator/
 */

import com.sun.xml.internal.bind.v2.TODO;

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
            } else if ("-".equals(var)) {
                result = addcalc.subtract(firstnum, secondnum);
            }
            System.out.println(Integer.toString(result));

        }

        private static int add(int first, int second) {
            int result = first + second;
            return result;
        }
        private static int subtract(int first, int second) {
            int result = 0;
            if (second < 10) {
                //TODO how
            }
            return result;
        }
        private static int multiply(int first, int second) {
            int result = 0;
            for (int i = 0; i < second; i++) {
                result += first;
            }
            return result;
        }
    }

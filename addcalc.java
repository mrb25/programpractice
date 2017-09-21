package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // retrieve the necessary inputs
        int firstnum, secondnum, result;
        String var;
        Scanner reader = new Scanner(System.in);
        System.out.println("First int:");
        firstnum = reader.nextInt();
        System.out.println("Operator: (+,-,*,/) ");
        var = reader.next();
        while (var != "+" || var != "-" || var != "*" || var != "/") {
            System.out.println("Not a correct variable, try again: ");
            var = reader.next();
        }
        System.out.println("Second Int: ");
        secondnum = reader.nextInt();


    }
}

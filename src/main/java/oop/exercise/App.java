package oop.exercise;

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        //prompt for name
        System.out.print("What is your name?");

        //create scanner for user input
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        //output string variable to concatenate to keep separate from input and output
        String output = "Hello, " + name + ", nice to meet you!";

        //print output
        System.out.println(output);
    }
}

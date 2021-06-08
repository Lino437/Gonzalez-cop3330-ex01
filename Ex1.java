/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Create a program that prompts for your name and prints a greeting using your name.

        Example Output
        What is your name? Brian
        Hello, Brian, nice to meet you!

        Constraint
        Keep the input, string concatenation, and output separate.

 */

package excercises_1.Ex01;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Hello " + name + " nice to meet you!");
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
            What is the input string? Homer
            Homer has 5 characters.
            Constraints
            Be sure the output contains the original string.
            Use a single output statement to construct the output.
            Use a built-in function of the programming language to determine the length of the string.
 */

package excercises_1.Ex02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string?");
        String string = scanner.nextLine();

        System.out.println(string + " has " + string.length() + " characters");
    }
}

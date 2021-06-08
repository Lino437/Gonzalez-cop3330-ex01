/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."
Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
 */


package excercises_1.Ex03;



import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scan.nextLine();

        System.out.println("Who said it?");
        String person = scan.nextLine();

        System.out.println(person + " says, \"" + quote + "\"");

    }
}

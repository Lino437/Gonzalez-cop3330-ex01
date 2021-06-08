/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story,
 creating an often silly or funny story as a result.

        Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

        Example Output
        Enter a noun: dog
        Enter a verb: walk
        Enter an adjective: blue
        Enter an adverb: quickly
        Do you walk your blue dog quickly? That's hilarious!
        Constraints
        Use a single output statement for this program.
        If your language supports string interpolation or string substitution, use it to build up the output.
 */

package excercises_1.Ex04;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a noun");
        String noun = scan.nextLine();

        System.out.println("Enter a verb");
        String verb = scan.nextLine();

        System.out.println("Enter a adjective");
        String adjective = scan.nextLine();

        System.out.println("Enter a adverb");
        String adverb = scan.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!\n");
    }
}

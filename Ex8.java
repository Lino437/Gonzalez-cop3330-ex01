/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */
/*
    Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

    Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
    Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

    Example Output
        How many people? 8
        How many pizzas do you have? 2
        How many slices per pizza? 8
        8 people with 2 pizzas (16 slices)
        Each person gets 2 pieces of pizza.
        There are 0 leftover pieces.

 */

package excercises_1.Ex08;

import java.util.Scanner;



public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        String people = scanner.nextLine();
        System.out.println("How many pizzas do you have?");
        String pizzas = scanner.nextLine();
        System.out.println("How many slices per pizza?");
        String slices = scanner.nextLine();

        int numPeople = Integer.valueOf(people);
        int numPizzas = Integer.valueOf(pizzas);
        int numSlices = Integer.valueOf(slices);
        int totalSlices = numPizzas * numSlices;


        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", totalSlices / numPeople);
        System.out.printf("There are %d leftover pieces.\n", totalSlices % numPeople);
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

        Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

        Example Output
        What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2
        Constraints
        Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
        Keep the inputs and outputs separate from the numerical conversions and other processing.
        Generate a single output statement with line breaks in the appropriate spots.

 */

package excercises_1.Ex05;

import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        String value1 = scanner.nextLine();

        System.out.println("What is the second number?");
        String value2 = scanner.nextLine();

        int first = Integer.valueOf(value1);
        int second = Integer.valueOf(value2);

        System.out.printf("%d + %d = %d\n", new Object[] {first, second, first + second});
        System.out.printf("%d - %d = %d\n", new Object[] {first, second, first - second});
        System.out.printf("%d * %d = %d\n", new Object[] {first, second, first * second});
        System.out.printf("%d / %d = %d\n", new Object[] {first, second, first / second});


    }
}

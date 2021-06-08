/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
 Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
  Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

    Example Output
    Enter the price of item 1: 25
    Enter the quantity of item 1: 2
    Enter the price of item 2: 10
    Enter the quantity of item 2: 1
    Enter the price of item 3: 4
    Enter the quantity of item 3: 1
    Subtotal: $64.00
    Tax: $3.52
    Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

 */
package excercises_1.Ex10;
import java.util.Scanner;

public class Ex10 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double price1 = Ex10.readNumber("Enter the price of item 1:");
        double qty1 = Ex10.readNumber("Enter the quantity of item 1:");
        double price2 = Ex10.readNumber("Enter the price of item 2:");
        double qty2 = Ex10.readNumber("Enter the quantity of item 2:");
        double price3 = Ex10.readNumber("Enter the price of item 3:");
        double qty3 = Ex10.readNumber("Enter the quantity of item 3:");

        double subtotal = price1*qty1 + price2*qty2 + price3*qty3;
        double tax = subtotal * .055;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.02f\n", subtotal);
        System.out.printf("Tax: $%.02f\n", tax);
        System.out.printf("Total: $%.02\n", total);
    }

    private static double readNumber(String Prompt){
        System.out.print(Prompt);
        return in.nextDouble();
    }
}

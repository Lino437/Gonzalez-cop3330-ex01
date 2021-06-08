/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*  Sometimes you have to round up to the next number rather than follow standard rounding rules.

    Calculate gallons of paint needed to paint the ceiling of a room.
     Prompt for the length and width, and assume one gallon covers 350 square feet.
      Display the number of gallons needed to paint the ceiling as a whole number.

    Example Output
        You will need to purchase 2 gallons of paint to cover 360 square feet.
    Remember, you can’t buy a partial gallon of paint. You must
    round up to the next whole gallon.

    Constraints
    Use a constant to hold the conversion rate.
    Ensure that you round up to the next whole number.

 */
package excercises_1.Ex09;
import java.util.Scanner;

public class Ex9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length?");
        String length = scanner.nextLine();
        System.out.println("What is the width?");
        String width = scanner.nextLine();

        double numLength = Double.valueOf(length);
        double numWidth = Double.valueOf(width);
        double area = numLength * numWidth;
        double numGallons = area / 350;

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil(numGallons), area);

    }
}

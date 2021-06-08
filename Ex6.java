/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Gonzalez
*/

/*
        Your computer knows what the current year is, which means you can incorporate that into your programs.
        You just have to figure out how your programming language can provide you with that information.

        Create a program that determines how many years you have left until retirement and the year you can retire.
        It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

        Example Output
        What is your current age? 25
        At what age would you like to retire? 65
        You have 40 years left until you can retire.
        It's 2015, so you can retire in 2055.
        Constraints
        Again, be sure to convert the input to numerical data before doing any math.
        Don’t hard-code the current year into your program. Get it from the system time via your programming language.

 */

package excercises_1.Ex06;

import java.util.Scanner;
import java.util.Calendar;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);


        System.out.println("What is your current age?");
        String ageValue = scanner.nextLine();

        System.out.println("At what age would you like to retire?");
        String retireValue = scanner.nextLine();

        int age = Integer.valueOf(ageValue);
        int retire = Integer.valueOf(retireValue);
        int yearsLeft = retire - age;

        String string = String.format("You have %d years left until you can retire.", yearsLeft);
        System.out.println(string);
        string = String.format("It's %d, so you can retire in %d.", year, year + yearsLeft);
        System.out.println(string);

    }
}

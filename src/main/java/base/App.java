package base;

import java.util.Scanner;

/*
Exercise 3 - Printing Quotes

Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and
author as shown in the example output.

--------Example Output---------
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

-------Constraints------
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise.
Use string concatenation instead.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.getQuote();
        String name = myApp.getStuff();

        myApp.printOutput(quote, name);
    }

    public void printOutput(String quote, String name) {
        //do
    }

    public String getQuote() {
        System.out.println("What is the quote? ");
        String quote = in.nextLine();
        return quote;
    }

    public String getStuff() {
        System.out.println("Who said it? ");
        String name = in.nextLine();
        return name;
    }
}

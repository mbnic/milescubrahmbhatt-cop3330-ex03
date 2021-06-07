/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;

import java.util.Scanner;


public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.getQuote();
        String name = myApp.getStuff();

        myApp.printOutput(quote, name);
    }

    public void printOutput(String quote, String name) {
        System.out.printf(name + " says, " + "\"" + quote + "\"");
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

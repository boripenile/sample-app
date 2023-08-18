package com.interswitch.maven;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf( "%s to %s\n", "Hello World",
                ulCase.wordToUpperCase("Hello World"));
        System.out.printf( "%s to %s\n", "  ",
                ulCase.wordToLowerCase("  "));

        System.out.println("New Go-home feature by " +
                "Backbone Team suggested at "
                + LocalDateTime.now());
    }
}

/****************************************************************************
 * Application java.
 *
 * Plein d'info.
 * ***************************************************************************/
package com.testfactory.tp1;

/**
 * My main application.
 * @author Willy
 *
 */
public final class Application {

    /**
    * Constructor.
    */
    private Application() { }
    /**
    * Main method.
    * @param args table of string.
    */
    public static void main(final String[] args) {
       System.out.println("Hello baby");
    }

     /**
     * Add two numbers.
     * @param number1 first integer.
     * @param number2 second integer.
     * @return an integer.
    */
    public static int add(final int number1, final int number2) {
       return number1 + number2;
    }
}

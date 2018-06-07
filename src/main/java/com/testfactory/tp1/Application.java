/****************************************************************************
 * Application java
 * 
 * Plein d'info 
 ***************************************************************************/
package com.testfactory.tp1;

/**
 * My main application.
 * @author Willy
 *
 */
public final class Application {
	
	/**
	 * Constructor
	 */
	private Application(){
		
	}
	
	/**
	 * Main method.
	 * @param args. 
	 */
	public static void main (final String[] args){
		System.out.println("Hello baby");
	}

	/**
	 * Add two value.
	 * @param i first value.
	 * @param j second value.
	 * @return result of addition.
	 */
	public static int add(final int number1,final int number2) {
		return number1 + number2;
	}
	
}

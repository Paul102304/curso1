// Fig. 2.7: Addition.java
// Program that displays the addition of two integers.
package Chapter_2;

import java.util.Scanner; // The program uses the Scanner class 

public class C2_5_Addition {
	
	// The main method starts the execution of Java application.
	public static void main( String arg[] ) {
		
		// Create Scanner object to get input from command window 
		Scanner entries = new Scanner( System.in );
		
		int num1 = 45;
		int num2 = 72;
		int addition;
		
		System.out.print( "Write the first number: "); // Indicator 
		num1 = entries.nextInt(); // Reads the user´s first number
		
		System.out.print( "Write the second number: "); // Indicator 
		num2 = entries.nextInt(); // Reads the user´s second number
		
		addition = num1 + num2; // Add the numbers 
		
		System.out.printf( "The addition is %d\n", addition ); // Shows the addition
		
	} // End of the main method

} // End of the Addition class.

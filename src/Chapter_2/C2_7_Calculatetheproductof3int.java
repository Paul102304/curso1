// Example 2.7: Product.java
// Calculate the product of three integers 
package Chapter_2;

import java.util.Scanner; // The program uses Scanner class

public class C2_7_Calculatetheproductof3int {
	// The main method starts the execution of Java application.
	public static void main(String arg[]) {

		// Create Scanner object to get input from command window
		Scanner entries = new Scanner(System.in);

		int x = 23; // First number introduced by the user
		int y = 45; // Second number introduced by the user
		int z = 35; // Third number introduced by the user
		int result;

		System.out.print( "Write the first number" ); // Input indicator
		x = entries.nextInt(); // Read the first number

		System.out.print( "Write the second number" ); // Input indicator
		y = entries.nextInt(); // Read the second number

		System.out.print( "Write the third bumber" ); // Input indicator
		z = entries.nextInt(); // Read the third number

		result = x * y * z; // Calculate the product of the numbers

		System.out.printf( "The product is %d\n", result );
 
	} // End of main method

} // End of the Product class

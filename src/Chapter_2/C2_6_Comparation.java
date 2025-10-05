// Fig. 2.15: Comparison. java
// Compares integers, using IF statements, relational and  equality operators.
package Chapter_2;

import java.util.Scanner; 

public class C2_6_Comparation {
	
public static void main(String[] args) {
		
		Scanner entries = new Scanner(System.in);
		
		int num1 = 5000; // First number to compare
		int num2 = 10000; // Second number to compare 
		
		System.out.print( "Enter the first number:  " );
		num1 = entries.nextInt();
		
		System.out.print( "Enter the second nuber: ") ;
		num2 = entries.nextInt();
		
		if (num1 == num2)
			System.out.printf("%d == %d\n", num1, num2);
		
		if (num1 != num2)
			System.out.printf("%d != %d\n", num1, num2);
		
		if (num1 < num2)
			System.out.printf("%d < %d\n", num1, num2);
		
		if (num1 > num2)
			System.out.printf("%d > %d\n", num1, num2);
			
		if (num1 <= num2)
			System.out.printf("%d <= %d\n", num1, num2);
		
		if (num1 >= num2)
			System.out.printf("%d >= %d\n", num1, num2);
		
	} // End of main method 

} // End of the Comparison class.



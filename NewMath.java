/**
* NewMath.java - A class that returns the results of multiple subtraction and multiplication problems made up of three variables of three different data types: 
* a short, a long, and a double. The results are then printed to the user's screen. The value of the short (s) is 23, the long (l) is 987493, and the double is 10.25.
*/

public class NewMath
{
	public static void main(String[] args)
	{
		short s = 23;
		long l = 987493;
		double d = 10.25;
		//subtraction
		System.out.println("short s - long l= " + (s - l));
		System.out.println("short s - double d= " + (s - d));
		System.out.println("long l - double d= " + (l - d));
		System.out.println("long l - short s= " + (l - s));
		System.out.println("double d - long l= " + (d - l));
		System.out.println("double d - short s= " + (d - s));
		//multiplication
		System.out.println("short s * long l= " + (s * l));
		System.out.println("short s * double d= " + (s * d));
		System.out.println("long l * double d= " + (l * d));

		/**
		* Calculate the results of the math problems.
		*/
	}
}
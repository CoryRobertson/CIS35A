import java.util.Scanner;
public class DigitsSum 
{
	public static void main(String[] args) 
	{
		//test commit line
		Scanner input = new Scanner(System.in); // create a scanner input
		System.out.println("Enter a number between 0 and 1000: "); // tell user what to input
		int number = input.nextInt(); // take the int input from the user
		 input.close(); // close input so eclipse stops yelling at me
	
		// declare variables for digits, could probably use an array here
		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		firstDigit = number % 10; // % 10 gets last digit
		number /= 10;// /= 10 removes last digit
		secondDigit = number % 10; // rinse and repeat
		number /= 10;
		thirdDigit = number % 10;
		number /= 10;
		fourthDigit = number % 10;
		
		// store the sum in a variable
		int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
		
		// print out the sum to the user
		System.out.println("The sum of the digits is " + sum);
		
	}

}

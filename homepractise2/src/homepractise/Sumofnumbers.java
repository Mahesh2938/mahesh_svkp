package homepractise;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		{ Scanner in = new Scanner(System.in); 
		System.out.println("Enter a number:");
		int number = in.nextInt(); 
		int sum = 0; int temp = number;
		
		while (temp != 0)
		{
			sum += temp % 10;
			temp /= 10;
		} 
		System.out.println("The sum of the digits of " + number + " is: " + sum);
		}
		
		
	}
}

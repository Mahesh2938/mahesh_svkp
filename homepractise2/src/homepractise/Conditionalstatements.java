package homepractise;

import java.util.Scanner;

public class Conditionalstatements {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int number=in.nextInt();
		if (number>0)
		{
			System.out.println("the number is positive");
		}
	else
	{
		System.out.println("rhe number is negative");
	}

}
}

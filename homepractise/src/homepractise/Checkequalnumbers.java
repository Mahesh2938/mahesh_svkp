package homepractise;

import java.util.Scanner;

public class Checkequalnumbers {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the first number");
		int first=in.nextInt();
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the second number");
		int second=in.nextInt();
		Scanner ke=new Scanner(System.in);
		System.out.println("enter the third number");
		int third=in.nextInt();
		
		if(first==second&&third==second)
		{
			System.out.println("the numbers is equal");
		}
		else
			System.out.println("the numbers is not equal");
		in.close();
        kb.close();
        ke.close();
	}
        
}

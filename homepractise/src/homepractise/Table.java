package homepractise;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the table number:");
		int num1=in.nextInt();
		
		 for(int i=1;i<100
				 ;i++)
		 {
			 System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)) );
		 }
	}

}

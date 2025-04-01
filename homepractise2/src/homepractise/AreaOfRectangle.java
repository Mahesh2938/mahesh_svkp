package homepractise;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the length of rectangle: ");
		double length=in.nextDouble();
		Scanner kb =new Scanner(System.in);
		System.out.println("enter the length of width: ");
		double width=kb.nextDouble();
		double perimeter=2*(length+width);
		double area=length*width;
		System.out.println("area of the rectangle:"+area);
		System.out.println("perimeter of the rectangle:"+perimeter);
		in.close();
		kb.close();
	}

}

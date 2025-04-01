package homepractise;

import java.util.Scanner;

public class ParameterOfCircle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the radius of a circle:");
		double radius=in.nextDouble();
		double perimeter=2*3.14*radius;
		double area=3.14*radius*radius;
		System.out.println("the perimeter of oa circle is:"+perimeter);
		System.out.println("the area of circle  is:"+area);
		
	}

}


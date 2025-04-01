package abstractmethod;

import java.util.Scanner;

public abstract class Shape {
	abstract void calculatearea();
	abstract void calculateperimeter();
	{
		
	}
	class Circle extends Shape{

		@Override
		void calculatearea() {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			double radius=in.nextDouble();
			
			double area=22.0/7*radius*radius;
			
			System.out.println("the area of the circle is:"+ area);
			
			
			
		}

		@Override
		void calculateperimeter() {
			Scanner kb=new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			double r=kb.nextDouble();
			double perimeter=22/7*r;
			System.out.println("the primeter of circle is:"+perimeter);
			

			
			
		}
		
	}

}

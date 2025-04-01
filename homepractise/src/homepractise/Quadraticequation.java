package homepractise;

import java.util.Scanner;

public class Quadraticequation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value a:");
		double a=in.nextDouble();
		
		System.out.println("enter the value b:");
		double b=in.nextDouble();
		
		System.out.println("enter the value c:");
		double c=in.nextDouble();
		double result=b*b-4.0*a*c;
		if(result>0.0) {
			double r1=(-b+Math.pow(result,0.5))/(2*a);
		double r2=(-b-Math.pow(result,0.5))/(2*a);
		System.out.println("the roots are"+r1+ "and"+r2);
		}
		else if(result==0) {
			double r1=-b/(2*a);
			
		System.out.println("the root are:"+r1);
		}
		else {
			System.out.println("the wrong roots");
			

	}

}
}

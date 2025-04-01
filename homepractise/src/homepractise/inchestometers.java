package homepractise;

import java.util.Scanner;

public class inchestometers {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the inches:");
		double inches=kb.nextDouble();
		double meter=(inches/39.370027);
		System.out.println("inches into meter:"+meter);
	}

}

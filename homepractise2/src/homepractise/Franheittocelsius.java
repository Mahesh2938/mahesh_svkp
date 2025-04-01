package homepractise;

import java.util.Scanner;

public class Franheittocelsius {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
				System.out.println("enter the farenheat:");
		          Double farenheat=in.nextDouble();
		          Double celsius=((farenheat-32.0)/9.0*5);
		          System.out.println(farenheat + "dergree farenheat is equal to "+celsius+"in celsius");
		
		
	}

}

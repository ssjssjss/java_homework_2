package ssj_2;

import java.util.Scanner;

public class ssj_3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter circle1's center x- and y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter circle2's center x- and y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();	
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<Math.abs(r1-r2))
			System.out.printf("circle2 is inside circle1");
		else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<r1+r2)
			System.out.printf("circle2 overlaps circle1");
		else
			System.out.printf("circle2 does not overlap circle1");
	}

}

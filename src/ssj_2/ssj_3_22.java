package ssj_2;

import java.util.Scanner;

public class ssj_3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double d;
		d=Math.sqrt(x*x+y*y);
		if(d<=10)
			System.out.printf("Point (%.1f, %.1f) is  in the circle",x,y);
		else
			System.out.printf("Point (%.1f, %.1f) is not in the circle",x,y);
	}
}

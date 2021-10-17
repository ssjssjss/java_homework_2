package ssj_2;

import java.util.Scanner;

public class ssj_3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();


		if(Math.abs(x)<=5 && Math.abs(y)<=2.5)
			System.out.printf("Point (%.1f, %.1f) is  in the rectanger",x,y);
		else
			System.out.printf("Point (%.1f, %.1f) is not in the rectanger",x,y);
	}

}

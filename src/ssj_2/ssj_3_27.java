package ssj_2;

import java.util.Scanner;

public class ssj_3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(y<=-0.5*x+100&&x>=0&&y>=0)
			System.out.printf("The point is in the trianger");
		else
			System.out.printf("The point is not in the trianger");
	}

}

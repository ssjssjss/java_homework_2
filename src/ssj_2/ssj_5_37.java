package ssj_2;

import java.util.Scanner;

public class ssj_5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		int y=0,r,i=0;
		while(x>0) {
			r=x%2;
			y+=r*Math.pow(10,i++);
			x/=2;
		}
			System.out.printf("The number in binary is "+y);
	}

}

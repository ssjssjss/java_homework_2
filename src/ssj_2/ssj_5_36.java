package ssj_2;

import java.util.Scanner;

public class ssj_5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int num = input.nextInt();
		int num2=num;
		int d10=0;
		for(int i=9;i>0;i--) {
			d10+=(num%10)*i;
			num/=10;
		}
		System.out.print("The ISBN-10 number is "+num2);
		if(d10%11!=10)
			System.out.print(d10%11);
		else
			System.out.print("X");
	}

}

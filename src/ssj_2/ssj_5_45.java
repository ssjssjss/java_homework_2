package ssj_2;

import java.util.Scanner;

public class ssj_5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter 10 numbers: ");
		double aver,deviation,sum1=0,sum2=0,n;
		for(int i=1;i<=10;i++) {
			n = input.nextDouble();
			sum1+=n;
			sum2+=n*n;
		}		
		aver=sum1/10;
		deviation=Math.sqrt((sum2-sum1*sum1/10)/9);
			System.out.printf("The mean is %.2f",aver);		
			System.out.printf("\nThe standard deviation is %.5f",deviation);
	}

}

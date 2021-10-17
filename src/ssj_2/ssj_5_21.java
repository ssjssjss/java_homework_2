package ssj_2;

import java.util.Scanner;

public class ssj_5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.print("Number of Years: ");
		double year = input.nextDouble();	
		double a,b,c;
		System.out.print("Interest Rate    Monthly Payment    Total Payment\n");	
		for(int i=0;i<=24;i++) {
		 a=(5+i/8.0)*0.01/12;	 		 
		 b=loan*a/(1-1/Math.pow(1+a,12*year));
		 c=b*year*12;
		System.out.printf("%.3f%%           %.2f             %.2f\n",5+i/8.0,b,c);
		}
	}

}

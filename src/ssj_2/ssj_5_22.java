package ssj_2;

import java.util.Scanner;

public class ssj_5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.print("Number of Years: ");
		double year = input.nextDouble();	
		System.out.print("Annual Interest Rate: ");
		double annualrate = input.nextDouble();
		double monthrate=annualrate/1200;
		double monthpay=loan*monthrate/(1-1/Math.pow(1+monthrate,12*year));
		double totalpay=monthpay*12*year;
		double interest,principal,balance=loan;
		System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f\nPayment#    Interest    Pricipal    Balance\n",monthpay,totalpay);	
		for(int i=1;i<=12*year;i++) {
		 interest=balance*monthrate;	 		 
		 principal=monthpay-interest;
		 balance=balance-principal;
		System.out.printf("%-4d%13.2f%13.2f%13.2f\n",i,interest,principal,balance);
		}
	}

}

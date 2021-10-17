package ssj_2;

import java.util.Scanner;

public class ssj_3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random()*1000);
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int guess1=guess/100;
		int guess2=guess%100/10;
		int guess3=guess%10;
		int lottery1=guess/100;
		int lottery2=guess%100/10;
		int lottery3=guess%10;
		if(lottery==guess)
			System.out.print("Exact match: you win $10000");
		else if(lottery==100*guess1+10*guess3+guess2||lottery==100*guess2+10*guess1+guess3||lottery==100*guess2+10*guess3+guess1||lottery==100*guess3+10*guess1+guess2||lottery==100*guess3+10*guess2+guess1)
			System.out.print("Match all gigits: you win &3000");
		else if(guess1==lottery1||guess1==lottery2||guess1==lottery3||guess2==lottery1||guess2==lottery2||guess2==lottery3||guess3==lottery1||guess3==lottery2||guess3==lottery3)
			System.out.print("Match one gigits: you win &1000");
		else
			System.out.print("Sorry, no match");
	}

}

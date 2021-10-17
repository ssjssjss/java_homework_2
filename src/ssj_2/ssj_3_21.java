package ssj_2;

import java.util.Scanner;

public class ssj_3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		int q,m,h,j,k;
		q=day;
		if(month==1||month==2) {
			 m=12+month;
			year--;
		}
		else 
			 m=month;
	    j=year/100;
		k=year%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		String[] weeklist= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.print("Day of the week is "+weeklist[h]);

	}

}

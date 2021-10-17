package ssj_2;

import java.util.Scanner;

public class ssj_5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("The Year: ");
		int year = input.nextInt();
		System.out.print("What day is the first day: ");
		int dayweek = input.nextInt()-1;
		int loap=0;
		if((year%4==0&&year%100!=0)||year%400==0) 
			loap=1;
		int[] list1= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] list3= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String[] list2= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<12;i++) {	
			System.out.printf(list2[i]+" 1, "+year+" is "+list3[dayweek]+"\n");
			dayweek=(dayweek+list1[i])%7;
			if(i==1) dayweek=(dayweek+loap)%7;
		}
	}

}

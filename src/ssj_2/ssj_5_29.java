package ssj_2;

import java.util.Scanner;

public class ssj_5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("The Year: ");
		int year = input.nextInt();
		System.out.print("What day is the first day: ");
		int dayweek = input.nextInt();
		if(dayweek==7) dayweek=0;
		int loap=0;
		if((year%4==0&&year%100!=0)||year%400==0) 
			loap=1;
		int[] list1= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] list2= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		list1[1]+=loap;
		for(int i=0;i<12;i++) {	
			
			System.out.printf("\t\t    "+list2[i]+" "+year+"\n");
			System.out.printf("______________________________________________________\n Sun     Mon     Tue     Wed     Thu     Fri     Sat\n");
			
				for(int k=0;k<8*dayweek;k++)
					System.out.print(" ");
				for(int m=1;m<=list1[i];m++) {
					System.out.printf("%4d    ",m);
					if((dayweek+m)%7==0) System.out.print("\n");
					
				}
				System.out.print("\n");
			
			dayweek=(dayweek+list1[i])%7;
			
		}
	}

}

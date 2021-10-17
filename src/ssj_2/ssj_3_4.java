package ssj_2;

import java.util.Scanner;

public class ssj_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = (int)(Math.random()*100)%12+1;
		String[] list= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.print(list[month-1]);
	}

}

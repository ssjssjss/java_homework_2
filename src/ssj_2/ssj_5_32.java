package ssj_2;

import java.util.Scanner;

public class ssj_5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lottery1 = (int)(Math.random()*10);
		int lottery2 = (int)(Math.random()*10);
		while(lottery1==lottery2) {
			lottery2 = (int)(Math.random()*10);
		}
			System.out.print(lottery1+lottery2);
	}

}

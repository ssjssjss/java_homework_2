package ssj_2;

import java.util.Scanner;

public class ssj_5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=6;i<10000;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) sum+=j;
			}
			if(i==sum) System.out.print(i+"\n");
		}
		
	}

}

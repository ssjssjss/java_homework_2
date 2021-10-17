package ssj_2;

import java.util.Scanner;

public class ssj_5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the number of lines: ");
		int line = input.nextInt();
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=line-i;j++)
			System.out.print("   ");
			for(int k=i;k>=2;k--)
				System.out.printf("%3d",k);
			for(int k=1;k<=i;k++)
				System.out.printf("%3d",k);
			System.out.print("\n");
		}
	}

}

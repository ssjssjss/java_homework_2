package ssj_2;



public class ssj_5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=101;i<=2100;i++) {
			if((i%4==0&&i%100!=0)||i%400==0) {
				System.out.print(i+" ");
				num++;
				if(num%10==0) 
					System.out.print("\n");
			}
		}
			System.out.printf("\nThe number of leap year is "+num);
	}

}
